// Added by the Spring Security Core plugin:
import grails.util.Environment

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/',               access: ['permitAll']],
        [pattern: '/error',          access: ['permitAll']],
        [pattern: '/index',          access: ['permitAll']],
        [pattern: '/index.gsp',      access: ['permitAll']],
        [pattern: '/shutdown',       access: ['permitAll']],
        [pattern: '/assets/**',      access: ['permitAll']],
        [pattern: '/**/js/**',       access: ['permitAll']],
        [pattern: '/**/css/**',      access: ['permitAll']],
        [pattern: '/**/images/**',   access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
        [pattern: '/assets/**',                         filters: 'none'],
        [pattern: '/**/js/**',                          filters: 'none'],
        [pattern: '/**/css/**',                         filters: 'none'],
        [pattern: '/**/images/**',                      filters: 'none'],
        [pattern: '/**/favicon.ico',                    filters: 'none'],
        [pattern: '/api/v1/public/**',                  filters: 'anonymousAuthenticationFilter'],
        [pattern: '/api/v1/docs',                    filters: 'anonymousAuthenticationFilter'],
        [pattern: '/actuator/**',                    filters: 'anonymousAuthenticationFilter'],
        [pattern: '/api/**',                            filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter']

]

grails.plugin.springsecurity.active = true
