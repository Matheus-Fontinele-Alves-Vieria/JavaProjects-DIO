# Bootcamp System

O Bootcamp Management System é um sistema de gerenciamento que permite administrar bootcamps, instrutores, alunos, cursos e conteúdos educacionais. Com essa aplicação, é possível acompanhar o progresso dos alunos, inscrever-se em cursos e calcular o progresso acadêmico.

## Funcionalidades

- Gerenciar instrutores, alunos e cursos.
- Inscrever alunos em bootcamps e acompanhar seu progresso.
- Calcular o XP total de um aluno com base nos conteúdos concluídos.

## Estrutura do Projeto

- `com.math.core`: Contém a classe `Bootcamp` e a interface `IBootcamp`.
- `com.math.entities`: Contém as classes `Content`, `Course`, `Instructor` e `Student`.
- `App.java`: Classe principal para executar e testar o sistema.

## Exemplo de Uso

Aqui estão alguns exemplos de como usar as funcionalidades do sistema:

### Criar um Curso

```java
Course course = new Course();
course.setTitle("Cálculo Diferencial e Integral");
course.setDescription("Conteúdos da disciplina de Cálculo.");
course.setWorkload(60);
```

### Criar um Instrutor

```java
Instructor instructor = new Instructor("Padilha");
instructor.addContent(course);
```

### Inscrever Aluno em um Bootcamp

```java
Bootcamp bootcamp = new Bootcamp("Bootcamp de Cálculo");
bootcamp.addContent(course);
bootcamp.addInstructor(instructor);

Student student = new Student("Matheus");
student.subscribeToBootcamp(bootcamp);
```

### Acompanhar Progresso do Aluno

```java
student.progress();
```

### Calcular XP Total do Aluno

```java
double totalXP = student.calculateTotalXP();
```

## Contribuição

Contribuições são bem-vindas! Se você encontrar problemas, bugs ou tiver sugestões de melhorias, sinta-se à vontade para criar uma issue ou enviar um pull request.