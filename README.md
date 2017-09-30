# jwt
Sample for Json Web Tokens
#####header:
```
{
    "typ": "JWT",
    "alg": "HS256"
}
```

#####payload:
```
{
    "iis": issuer (String or Uri)
    "iat": JWT time issued (number value),
    "exp": JWT Expiration date (number value),
    "jti": JWT unique identifier,
    "uid": unique identifier
}
```
#####Signature:
Hash defined as:
```
HS256(
    base64(header) + "." + base64(payload),
    secret
  )
```

All the jwt will be defined as:

base64(header) + "." + base64(payload) + "." + base64(signature)



