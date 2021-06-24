localhost:8282/oauth/token
Auth: Basic (pass hard coded client id and client secret)
    Post call with type as form-encoded


localhost:8282/oauth/check_token?token=anbb
dont pass client id and password => unauthorized
auth as basic: username and password => Forbidden
(Now in properties add PermitAll value)

localhost:8282/oauth/token
Auth => Basic with values from AuthServerConfiguration
form-value => give values from UserConf