# MAD Practical-6  
**Android Application demonstrating Frame-by-frame animation and Tween animation (Splash Screen).**

---

## 🎯 AIM
Create an Android Application to demonstrate:
- **Frame-by-frame animation**  
- **Splash screen with tween animation**

---

## 📚 Concepts to Study
- `ImageView`  
- Frame-by-Frame Animation  
- Tween Animation  
- Immersive Mode  
- Display Edge to Edge  
- SplashScreen  
- `AnimationDrawable`  
- `onWindowFocusChanged()` Method  
- `AnimationUtils` class  
- `loadAnimation()` method  
- `setAnimationListener()` method  
- `overridePendingTransition()` method  
- `finish()` method  
- `anim` folder in `res`  
- Convert SVG file to `.xml` file  

---

## 📖 Theory

### 🔹 What is Frame-by-Frame Animation?
Frame-by-frame animation is an animation technique where each frame is drawn individually, similar to a flipbook. When shown in quick succession, it creates the illusion of movement.  
In Android, this is implemented using the **`AnimationDrawable`** class, where a sequence of drawable resources is defined in an XML file (usually in `res/drawable`) using the `<animation-list>` element.

---

### 🔹 What is Tween Animation?
Tween (short for *in-between*) animation defines the **start and end points** of an animation, and the system generates intermediate frames automatically.  
It is used to perform transformations on a View, such as:
- Position  
- Size  
- Rotation  
- Transparency  

In Android, tween animations are defined in XML files (in the `res/anim` folder) using tags like:
- `<scale>`  
- `<translate>`  
- `<rotate>`  
- `<alpha>`  
Grouped together inside a `<set>` tag.

---

### 🔹 Edge-to-Edge Content Display

<h1>Output:</h1>
<table >
 <tr>
  <th>
    Starting:
  </th>
  <th>
      White Theme:
  </th>
  <th>
      Dark Theme:
  </th>
 </tr>
  <tr>
   <td> <img width="370" height="660" alt="image" src="https://github.com/user-attachments/assets/babf47c9-98a0-4b4c-a814-53564236dd0a" />

   </td>
    <td><img width="370" height="660" alt="image" src="https://github.com/user-attachments/assets/084a4b3f-8373-461f-8a9c-697a4406ddc8" />
</td>
    <td><img width="370" height="660" alt="image" src="https://github.com/user-attachments/assets/47f34f55-f798-451d-b599-0fc9475d8b55" />
</td>
  </tr>
</table>
