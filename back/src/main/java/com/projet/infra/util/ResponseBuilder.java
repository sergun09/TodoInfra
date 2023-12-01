package com.projet.infra.util;

import java.util.HashMap;
import java.util.Map;

public class ResponseBuilder {
    private final Map<String, String> args;

    public ResponseBuilder() {
        args = new HashMap<>();
    }

    public ResponseBuilder addArg(String cle, String val) {
        args.put(cle, val);
        return this;
    }

    @Override
    public String toString() {
        String res = "{";
        StringBuilder valeurs = new StringBuilder();

        for (String cle : args.keySet()) {
            valeurs.append(",\"").append(cle).append("\":\"").append(args.get(cle)).append("\"");
        }

        if (args.size() > 0) {
            res += valeurs.substring(1);
        }
        res += "}";
        return res;
    }
}
