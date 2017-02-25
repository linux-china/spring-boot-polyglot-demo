package org.mvnsearch.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.mvnsearch.PurchaseOrder;
import org.springframework.stereotype.Service;

/**
 * user service implementation
 *
 * @author linux_china
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    public void placeOrder(PurchaseOrder order) {
        log.info("good");
    }
}
