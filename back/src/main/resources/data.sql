DROP TABLE IF EXISTS note;
CREATE TABLE note (
    id varchar(250) primary key ,
    titre varchar(250),
    description varchar(250),
    couleur varchar(250)
);

INSERT INTO note (id,titre,description, couleur) values
    ('-1','Hello','En français : bonjour', '#f3858e'),
    ('-2','Prakesh-3000', 'Le mentor de Sinan','#f3858e'),
    ('-3','Texte en Latin','Nam quis nulla. Integer malesuada. In in enim a arcu imperdiet malesuada. Sed vel lectus. Donec odio urna, tempus molestie, porttitor ut, iaculis quis, sem. Phasellus rhoncus. Aenean id metus id velit','#f3858e');