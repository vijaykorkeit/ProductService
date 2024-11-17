package com.dailycodebuffer.ProductService.model;

public class ProductResponse {

    private long productId;
    private String productName;
    private long price;
    private long quantity;

    // Private constructor to enforce the use of Builder
    private ProductResponse(Builder builder) {
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.price = builder.price;
        this.quantity = builder.quantity;
    }

    // Static nested Builder class
    public static class Builder {
        private long productId;
        private String productName;
        private long price;
        private long quantity;

        public Builder setProductId(long productId) {
            this.productId = productId;
            return this; // Return the Builder object for method chaining
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setPrice(long price) {
            this.price = price;
            return this;
        }

        public Builder setQuantity(long quantity) {
            this.quantity = quantity;
            return this;
        }

        public ProductResponse build() {
            return new ProductResponse(this);
        }
    }

    // Getters for ProductResponse fields
    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public long getPrice() {
        return price;
    }

    public long getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
