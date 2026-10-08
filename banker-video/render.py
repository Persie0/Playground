"""Manim CE narrated Banker's Algorithm YouTube explainer. Public educational content."""
from manim import *
from pathlib import Path
import json, math
from manim.utils.rate_functions import smooth
ROOT=Path(__file__).parent
SRC=json.loads((ROOT/"timing.json").read_text())
BG="#09192A"; PLATE="#182F48"; FG="#E9F5FF"; CY="#40DCCA"; BLUE="#78B7FF"; AMBER="#FFBD70"; BAD="#F77783"
COLORS=[CY,BLUE,AMBER]
CLAIM=[[3,2,2],[6,1,3],[3,1,4],[4,2,2]]
ALLOC=[[1,0,0],[5,1,1],[2,1,1],[0,0,2]]
NEED=[[c-a for c,a in zip(cr,ar)] for cr,ar in zip(CLAIM,ALLOC)]
def t(s,sz=28,col=FG):
 return Text(str(s),font="DejaVu Sans",font_size=sz,color=col)
def card(width,height,loc,co=BLUE):
 return RoundedRectangle(width=width,height=height,corner_radius=.18,
  stroke_width=2,stroke_color=co,fill_color=PLATE,fill_opacity=.96).move_to(loc)
def vector(values,center,title="",scale=1):
 x,y=center
 items=VGroup()
 if title:items.add(t(title,22*scale,BLUE).move_to([x,y+.7*scale,0]))
 for j,v in enumerate(values):
  px=x+(j-1)*.95*scale
  sq=RoundedRectangle(width=.82*scale,height=.68*scale,corner_radius=.10*scale,
   color=COLORS[j],fill_color=BG,fill_opacity=1).move_to([px,y,0])
  items.add(sq,t(v,31*scale,COLORS[j]).move_to(sq))
 return items
def procs(active=0,done=()):
 elements=VGroup()
 for j in range(4):
  y=2.05-j*1.13
  color=CY if j+1 in done else AMBER if j+1==active else BLUE
  c=Circle(radius=.35,color=color,fill_color=PLATE,fill_opacity=1).move_to([-5.4,y,0])
  elements.add(c,t("P"+str(j+1),22,color).move_to(c))
  elements.add(t("FINISHED" if j+1 in done else "CHECK" if j+1==active else "WAIT",17,color).move_to([-4.26,y,0]))
 return elements
def matrix(rows,title,x,col):
 z=VGroup(card(3.8,4.0,[x,-.25,0],col))
 z.add(t(title,24,col).move_to([x,1.45,0]))
 for i,row in enumerate(rows):
  y=.9-i*.73
  z.add(t("P"+str(i+1),19,BLUE).move_to([x-1.4,y,0]))
  for j,n in enumerate(row):z.add(t(n,27,COLORS[j]).move_to([x-.55+.78*j,y,0]))
 return z
def flow_tokens(scene,src,dst,counts=(1,0,1)):
 colors=[COLORS[i] for i,v in enumerate(counts) for _ in range(min(4,v))]
 particles=VGroup(*[Dot(src,color=c,radius=.09) for c in colors])
 if not particles:return
 scene.add(particles)
 paths=[ArcBetweenPoints(src,dst,angle=.30+(i%3)*.12) for i in range(len(particles))]
 scene.play(LaggedStart(*[MoveAlongPath(p,pa) for p,pa in zip(particles,paths)],lag_ratio=.14),run_time=2.7)
 scene.remove(*particles)
class BankersExplainer(Scene):
 def construct(self):
  self.camera.background_color=BG
  self.clock=0
  for idx,item in enumerate(SRC):
   self.clear()
   start=self.renderer.time
   name=item["title"]; kind=item["kind"];data=item.get("data",{})
   self.add_sound(str(ROOT/"audio"/f'{idx:03}.wav'))
   chapter=t(item["chapter"],20,CY if "SAFE" in item["chapter"] else BLUE).to_corner(UL,buff=.45)
   hd=t(name,35 if len(name)<42 else 29).next_to(chapter,DOWN,aligned_edge=LEFT,buff=.22)
   rule=Line([-6.75,2.62,0],[6.75,2.62,0],color=CY,stroke_width=3)
   foot=t(f"TU WIEN • BANKER'S ALGORITHM                                    {idx+1:02d}/{len(SRC)}",14,BLUE)
   foot.to_edge(DOWN,buff=.19)
   self.play(FadeIn(chapter,shift=.15*RIGHT),FadeIn(hd,shift=.16*UP),Create(rule),run_time=1.25)
   self.add(foot)
   focus=None
   if kind=="intro":
    self.play(Write(t("SAFE ALLOCATION  ≠  FREE RESOURCES",45,CY).move_to([0,.6,0])),run_time=2.8)
    allp=VGroup(*[Circle(radius=.36,color=COLORS[j%3]).move_to([x,y,0]) for j,(x,y) in enumerate([(-4,-1.4),(-1.3,-1.4),(1.3,-1.4),(4,-1.4)])])
    self.play(LaggedStart(*[Create(p) for p in allp],lag_ratio=.20),run_time=2)
    focus=allp
   elif kind=="cycle":
    points=[LEFT*2.6+UP*.8,RIGHT*2.6+UP*.8,RIGHT*2.6+DOWN*1.7,LEFT*2.6+DOWN*1.7]
    nodes=VGroup(*[Circle(radius=.48,color=BAD,fill_color=PLATE,fill_opacity=1).move_to(p) for p in points])
    texts=VGroup(*[t(f"P{i+1}",28).move_to(p) for i,p in enumerate(points)])
    arrows=VGroup(*[Arrow(points[i],points[(i+1)%4],buff=.55,color=BAD,stroke_width=5) for i in range(4)])
    self.play(LaggedStart(*[GrowFromCenter(x) for x in nodes],lag_ratio=.2),FadeIn(texts),run_time=2)
    self.play(LaggedStart(*[GrowArrow(a) for a in arrows],lag_ratio=.2),run_time=2.4)
    for node in nodes:self.play(Indicate(node,color=AMBER),run_time=.8)
    focus=arrows
   elif kind=="matrices":
    mats=[matrix(CLAIM,"MAXIMUM CLAIM C",-4.25,BLUE),matrix(ALLOC,"ALLOCATION A",0,CY),matrix(NEED,"NEED N",4.25,AMBER)]
    self.play(LaggedStart(*[FadeIn(m,shift=.35*UP) for m in mats],lag_ratio=.2),run_time=3)
    for m in mats:self.play(Circumscribe(m,color=CY,fade_out=True),run_time=1.25)
    eq=t("NEED = CLAIM − ALLOCATION",31,AMBER).move_to([0,-2.83,0])
    self.play(Write(eq),run_time=1.7)
    focus=mats[2]
   elif kind=="vector":
    nums=data["nums"];lab=data.get("lab","RESOURCE VECTOR")
    v=vector(nums,(0,.7),lab,1.5)
    self.play(LaggedStart(*[GrowFromCenter(x) for x in v],lag_ratio=.13),run_time=2.7)
    for j,qty in enumerate(nums):
     dots=VGroup(*[Dot(radius=.11,color=COLORS[j]) for _ in range(qty)])
     if len(dots):
      dots.arrange_in_grid(cols=3,buff=.2).move_to([(j-1)*3.55,-1.75,0])
      self.play(LaggedStart(*[GrowFromCenter(d) for d in dots],lag_ratio=.06),run_time=.9)
    focus=v
   elif kind=="safety":
    steps=["1   COPY AVAILABLE INTO WORK","2   FIND NEED ≤ WORK","3   SIMULATE FINISH & RELEASE","4   REPEAT UNTIL NONE FIT","5   ALL FINISHED?  SAFE!"]
    group=VGroup()
    for j,st in enumerate(steps):
     p=card(10.5,.6,[0,1.88-j*.85,0],CY if data.get("focus")==j else BLUE)
     txt=t(st,25,CY if data.get("focus")==j else FG).move_to(p)
     group.add(VGroup(p,txt))
    self.play(LaggedStart(*[FadeIn(x,shift=.2*UP) for x in group],lag_ratio=.22),run_time=3)
    for x in group:self.play(Indicate(x,color=CY),run_time=.7)
    focus=group[min(data.get("focus",1),4)]
   elif kind=="request":
    lines=["REQUEST Q ≤ NEED ?","REQUEST Q ≤ AVAILABLE ?","TENTATIVE: V −= Q ; A += Q ; N −= Q","RUN SAFETY TEST","SAFE: COMMIT    UNSAFE: ROLLBACK"]
    group=VGroup()
    for j,st in enumerate(lines):
     p=card(10.7,.6,[0,1.93-j*.84,0],CY if j==data.get("focus",0) else BLUE)
     tx=t(st,26 if len(st)<41 else 21,CY if j==data.get("focus",0) else FG).move_to(p)
     group.add(VGroup(p,tx))
    self.play(LaggedStart(*[FadeIn(x,shift=.22*RIGHT) for x in group],lag_ratio=.20),run_time=3.0)
    for j in range(len(group)):self.play(Indicate(group[j],color=CY),run_time=.8)
    focus=group[data.get("focus",0)]
   elif kind=="comparison":
    n=data["need"]; w=data["work"];f=all(a<=b for a,b in zip(n,w))
    nx=vector(n,(-3.45,1.25),"NEED");wx=vector(w,(3.45,1.25),"WORK")
    self.play(FadeIn(nx,shift=RIGHT),FadeIn(wx,shift=LEFT),run_time=1.9)
    cards=VGroup()
    for j,(a,b) in enumerate(zip(n,w)):
     x=-3.95+j*3.95
     pc=card(3.4,1.75,[x,-.8,0],COLORS[j])
     expr=t(f"R{j+1}:  {a} {'≤' if a<=b else '>'} {b}",28,CY if a<=b else BAD).move_to([x,-.62,0])
     status=t("PASS" if a<=b else "BLOCKED",22,CY if a<=b else BAD).move_to([x,-1.18,0])
     cards.add(VGroup(pc,expr,status))
    self.play(LaggedStart(*[FadeIn(x,shift=UP*.15) for x in cards],lag_ratio=.25),run_time=2.4)
    for v in cards:self.play(Indicate(v,color=CY if f else BAD),run_time=.9)
    focus=cards
   elif kind=="example":
    p=data.get("p",0);w0=data["w0"];w1=data["w1"];need=data.get("need",[0,0,0]);alloc=data.get("alloc",[0,0,0]);done=data.get("done",[])
    grp=procs(p,done)
    w=vector(w0,(2.95,1.35),"WORK VECTOR W",1.12)
    self.play(FadeIn(grp,shift=RIGHT),FadeIn(w,shift=LEFT),run_time=2)
    if p:
     n=vector(need,(2.95,-.55),f"NEED OF P{p}",.92)
     self.play(FadeIn(n,shift=.18*UP),run_time=1.2)
     for j,(a,b) in enumerate(zip(need,w0)):
      cx=1.0+j*1.91
      e=t(f"{a} {'≤' if a<=b else '>'} {b}",25,CY if a<=b else BAD).move_to([cx,-2.1,0])
      self.play(Write(e),run_time=.6)
      self.play(Indicate(e,color=CY if a<=b else BAD),run_time=.6)
    if w0!=w1:
     src=[-5.4,2.05-(p-1)*1.13,0] if p else [-4,0,0]
     dest=w.get_center()
     flow_tokens(self,src,dest,tuple(alloc) if data.get("release") else (1,0,1))
     nw=vector(w1,(2.95,1.35),"WORK VECTOR W",1.12)
     self.play(Transform(w,nw),run_time=1.55)
    focus=w
   elif kind=="sequence":
    order=data.get("order",[2,1,3,4]);nodes=VGroup()
    for j,p in enumerate(order):
     node=Circle(radius=.47,color=CY,fill_color=PLATE,fill_opacity=1).move_to([-4.2+j*2.8,0,0])
     nodes.add(VGroup(node,t(f"P{p}",25,CY).move_to(node)))
    self.play(LaggedStart(*[GrowFromCenter(x) for x in nodes],lag_ratio=.24),run_time=2.8)
    for j in range(3):
     arr=Arrow(nodes[j].get_center(),nodes[j+1].get_center(),buff=.57,color=AMBER,stroke_width=5)
     self.play(GrowArrow(arr),run_time=.9)
    focus=nodes
   else:
    box=card(10,2.6,[0,-.3,0],CY)
    big=t(data.get("text","SAFE STATE MEANS A COMPLETION ORDER EXISTS"),30,CY).move_to(box)
    self.play(GrowFromCenter(box),Write(big),run_time=3)
    focus=big
   remain=item["duration"]-(self.renderer.time-start)
   while remain>2.6:
    if focus is not None:
     duration=min(1.8,remain-1)
     self.play(Indicate(focus,color=CY,scale_factor=1.015),run_time=duration)
    else:self.wait(min(1.5,remain-1))
    remain=item["duration"]-(self.renderer.time-start)
   if remain>0:self.wait(remain)
