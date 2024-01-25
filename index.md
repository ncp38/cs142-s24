---
layout: home
title: Home
nav_exclude: false
nav_order: 0
seo:
  type: Course
  name: Just the Class
---

# {{ site.tagline }}
{: .mb-2 }
{{ site.description }}
{: .fs-6 .fw-300 }

{% if site.announcements %}
{{ site.announcements.last }}
[Announcements](announcements.md){: .btn .btn-outline .fs-3 }
{% endif %}

## Administrivia
- Instructor: Nate Phillips
- Office hours: Mon 1-3 PM, Wed 1-3 PM.  Also available by appointment and over Slack or Zoom.
- [Section 1 Canvas page](https://rhodes.instructure.com/courses/6557) and [Section 2 Canvas page](https://rhodes.instructure.com/courses/6563): Use for grades, online assignment submissions, and assignment solutions. (Canvas pages pending; please pardon my work in progress!)
- [Syllabus](syllabus/syllabus-142-s24.pdf) and [additional policies](syllabus/additional-policies-142-s24.pdf).
- Tutoring hours: Sunday through Thursday evenings, 5-11pm, Briggs 001 

(Tutoring will be in Slack on 1-24-24 and 1-25-25 from 5-10 PM, at the following link:  

https://rhodes-cs.slack.com/archives/C0105S6BHHU

If you want to request tutoring, you should type in 
"/tutorme [their class name] [their question]"
into the slack channel.)


## Resources
- Textbooks and tutorials: *Introduction to Java* by Liang (textbook), 
	*Introduction to Programming in Java* by Sedgewick and Wayne (textbook),
        [official Java tutorials](https://docs.oracle.com/javase/tutorial/), 
        [Introduction to Programming Using Java](http://math.hws.edu/javanotes/index.html) (free online textbook)
- Java in the browser: [Repl.it](http://repl.it/new/java), <a href="http://codehs.com">CodeHS</a>
- Coding exercises for practice, review, and improvement: [Exercism](https://exercism.org/tracks/java/exercises)
- <a href="https://docs.oracle.com/en/java/javase/17/docs/api/">Official Java documentation</a>
     

## Calendar
{% for module in site.modules %}
{{ module }}
{% endfor %}

