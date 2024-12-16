package edu.famu.ecommerece.model;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AProducts {

        @DocumentId
        private @Nullable String productId;
        private String name;
        private String description;
        private Number price;
        private Number stock;
        private String imageUrl;
        private String category;
        private Timestamp createdAt;

        public Timestamp getCreatedAt() {
            return createdAt;
        }

    public void setCreatedAt(String createdAt)
    {
        this.createdAt = Timestamp.parseTimestamp(createdAt));
    }

}
