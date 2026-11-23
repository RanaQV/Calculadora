Documentación del Flujo de Trabajo en Git (Calculadora)

Este documento describe paso a paso el flujo de trabajo realizado en el repositorio, basado en el historial de ramas, commits y Pull Requests.

1. Inicialización del Proyecto (main)

Todo el proyecto parte desde la rama principal (main) con un commit inicial que establece la base del repositorio.

# Inicializa un repositorio local de Git
git init

# Añade los archivos iniciales al área de preparación (staging)
git add .

# Crea el primer commit en la historia del proyecto
git commit -m "Initial commit"

# Renombra la rama actual a 'main' y la sube al repositorio remoto (origin)
git branch -M main
git push -u origin main


2. Desarrollo del Frontend (Frontend)

A partir del commit inicial, se creó una rama independiente llamada Frontend para trabajar en la estructura visual sin afectar directamente a la rama principal.

Creación y cambio de rama

# Crea la rama 'Frontend' desde 'main' y cambia a ella automáticamente
git checkout -b Frontend


(Nota: En versiones modernas de Git también se puede usar git switch -c Frontend).

Registro de cambios y subida al remoto

Una vez creado el archivo HTML, se guardaron los cambios en el historial de esta rama:

# Añade los archivos HTML creados al área de preparación
git add .

# Registra los cambios con el mensaje descriptivo mostrado en el historial
git commit -m "Creación HTML"

# Sube la rama 'Frontend' y su historial al repositorio remoto (origin)
git push -u origin Frontend


3. Integración mediante Pull Request (Merge pull request #1)

Con el trabajo de la rama Frontend subido a GitHub, se realizó un Pull Request (PR #1) hacia la rama main para integrar la estructura HTML al proyecto principal.

Acción en GitHub: Se abrió el Pull Request #1 comparando Frontend -> main y se aprobó la fusión (Merge).

Resultado en el historial: Se generó automáticamente el commit Merge pull request #1 from RanaQV/Frontend en origin/main.

Sincronización local (Opcional/Recomendado)

Para actualizar nuestra rama principal en local tras hacer el merge en la web:

# Volver a la rama principal
git checkout main

# Descargar los últimos cambios fusionados desde el repositorio remoto
git pull origin main


4. Desarrollo del Backend (backend)

Paralelamente (partiendo también desde el Initial commit), se creó una segunda rama llamada backend para desarrollar la lógica de la calculadora.

Creación de la rama y desarrollo

# Estando en el punto del 'Initial commit', se crea la rama 'backend'
git checkout -b backend


Guardado y subida de la lógica

Una vez implementada la funcionalidad de la calculadora, se registró el avance:

# Prepara los archivos de la lógica de la calculadora
git add .

# Crea el commit con los avances del backend
git commit -m "Calculadora creada"

# Sube la rama 'backend' al repositorio remoto
git push -u origin backend


Resumen Visual del Estado Actual

origin/main: Contiene el Initial commit más la fusión de la rama Frontend (Creación HTML) mediante el Pull Request #1.

Frontend: Rama sincronizada con el remoto que contiene la estructura HTML.

backend: Rama activa en local y sincronizada con el remoto (origin/backend) que contiene el commit Calculadora creada, lista para un futuro Pull Request hacia main.