<#import "components/common.ftl" as e>
<#import "components/login.ftl" as l>

<@e.page>

<#if Session?? && Session.SPRING_SECURITY_LAST_EXCEPTION??>
    <div class="alert alert-danger" role="alert">
        ${Session.SPRING_SECURITY_LAST_EXCEPTION.message}
    </div>
</#if>

<#if message??>
<div class="alert alert-${messageType}" role="alert">
    ${message}
</div>
</#if>

<@l.login "/login" false/>

</@e.page>