pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "msbank"

include(
    "msbank-money",
    "msbank-br-validators",
    "msbank-domain",
    "msbank-application",
    "msbank-infrastructure",
    "msbank-api",
    "msbank-cli",
    "msbank-lab",
)
