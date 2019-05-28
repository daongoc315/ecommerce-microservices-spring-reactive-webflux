package demo.ecommerce.order.repository;

import demo.ecommerce.order.model.ShoppingCartItem;
import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ShoppingCartItemRepository extends ReactiveCrudRepository<ShoppingCartItem, Long> {

    @Query("Select * from shopping_cart_item where shopping_cart_id = $1")
    Flux<ShoppingCartItem> getShoppingOrderCartItems(Long cartId);

}