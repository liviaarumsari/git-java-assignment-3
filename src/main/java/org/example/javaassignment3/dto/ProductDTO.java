package org.example.javaassignment3.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.example.javaassignment3.entity.Product;
import java.math.BigDecimal;

@Data
public class ProductDTO {
    @NotBlank(message = "Nama wajib diisi")
    private String nama;

    @NotNull(message = "Harga Beli wajib diisi")
    @Min(value = 0, message = "Harga Beli harus lebih besar atau sama dengan 0")
    private BigDecimal hargaBeli;

    @NotNull(message = "Harga Jual wajib diisi")
    @Min(value = 0, message = "Harga Jual harus lebih besar atau sama dengan 0")
    private BigDecimal hargaJual;

    public Product toProduct() {
        return new Product(nama, hargaBeli, hargaJual);
    }
}
