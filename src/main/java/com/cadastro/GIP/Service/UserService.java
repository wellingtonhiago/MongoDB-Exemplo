package com.cadastro.GIP.Service;

import com.cadastro.GIP.model.User;

import java.util.Map;

public class UserService {

    public static User update(User client, Map<String, Object> updates) {

        for (Map.Entry<String, Object> entry : updates.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            switch (key) {
                case "name":
                    client.setIdGip((String) value);
                    break;
            }
        }

        return client;
    }
}
