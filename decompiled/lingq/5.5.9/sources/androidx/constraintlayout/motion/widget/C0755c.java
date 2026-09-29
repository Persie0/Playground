package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.C0762b;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.linguist.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p038c2.C1660c;
import p128g2.AbstractC5666d;
import p128g2.C5663a;
import p128g2.C5669g;
import p128g2.C5674l;
import p128g2.C5676n;
import p128g2.C5679q;
import p128g2.InterpolatorC5683u;
import p128g2.RunnableC5682t;
import p143h2.C5881d;
import p290o6.C7967l0;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0755c {

    /* JADX INFO: renamed from: a */
    public int f5218a;

    /* JADX INFO: renamed from: e */
    public int f5222e;

    /* JADX INFO: renamed from: f */
    public final C5669g f5223f;

    /* JADX INFO: renamed from: g */
    public final C0762b.a f5224g;

    /* JADX INFO: renamed from: j */
    public int f5227j;

    /* JADX INFO: renamed from: k */
    public String f5228k;

    /* JADX INFO: renamed from: o */
    public final Context f5232o;

    /* JADX INFO: renamed from: b */
    public int f5219b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f5220c = false;

    /* JADX INFO: renamed from: d */
    public int f5221d = 0;

    /* JADX INFO: renamed from: h */
    public int f5225h = -1;

    /* JADX INFO: renamed from: i */
    public int f5226i = -1;

    /* JADX INFO: renamed from: l */
    public int f5229l = 0;

    /* JADX INFO: renamed from: m */
    public String f5230m = null;

    /* JADX INFO: renamed from: n */
    public int f5231n = -1;

    /* JADX INFO: renamed from: p */
    public int f5233p = -1;

    /* JADX INFO: renamed from: q */
    public int f5234q = -1;

    /* JADX INFO: renamed from: r */
    public int f5235r = -1;

    /* JADX INFO: renamed from: s */
    public int f5236s = -1;

    /* JADX INFO: renamed from: t */
    public int f5237t = -1;

    /* JADX INFO: renamed from: u */
    public int f5238u = -1;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f5239a;

        /* JADX INFO: renamed from: b */
        public final int f5240b;

        /* JADX INFO: renamed from: c */
        public final C5676n f5241c;

        /* JADX INFO: renamed from: d */
        public final int f5242d;

        /* JADX INFO: renamed from: f */
        public final C0756d f5244f;

        /* JADX INFO: renamed from: g */
        public final Interpolator f5245g;

        /* JADX INFO: renamed from: i */
        public float f5247i;

        /* JADX INFO: renamed from: j */
        public float f5248j;

        /* JADX INFO: renamed from: m */
        public final boolean f5251m;

        /* JADX INFO: renamed from: e */
        public final C7967l0 f5243e = new C7967l0(1);

        /* JADX INFO: renamed from: h */
        public boolean f5246h = false;

        /* JADX INFO: renamed from: l */
        public final Rect f5250l = new Rect();

        /* JADX INFO: renamed from: k */
        public long f5249k = System.nanoTime();

        public a(C0756d c0756d, C5676n c5676n, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            this.f5251m = false;
            this.f5244f = c0756d;
            this.f5241c = c5676n;
            this.f5242d = i11;
            if (c0756d.f5256e == null) {
                c0756d.f5256e = new ArrayList<>();
            }
            c0756d.f5256e.add(this);
            this.f5245g = interpolator;
            this.f5239a = i13;
            this.f5240b = i14;
            if (i12 == 3) {
                this.f5251m = true;
            }
            this.f5248j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            m2852a();
        }

        /* JADX INFO: renamed from: a */
        public final void m2852a() {
            boolean z10 = this.f5246h;
            int i10 = this.f5240b;
            int i11 = this.f5239a;
            C0756d c0756d = this.f5244f;
            Interpolator interpolator = this.f5245g;
            C5676n c5676n = this.f5241c;
            if (!z10) {
                long jNanoTime = System.nanoTime();
                long j10 = jNanoTime - this.f5249k;
                this.f5249k = jNanoTime;
                float f3 = (((float) (j10 * 1.0E-6d)) * this.f5248j) + this.f5247i;
                this.f5247i = f3;
                if (f3 >= 1.0f) {
                    this.f5247i = 1.0f;
                }
                boolean zM12042c = c5676n.m12042c(interpolator == null ? this.f5247i : interpolator.getInterpolation(this.f5247i), jNanoTime, c5676n.f34616b, this.f5243e);
                if (this.f5247i >= 1.0f) {
                    if (i11 != -1) {
                        c5676n.f34616b.setTag(i11, Long.valueOf(System.nanoTime()));
                    }
                    if (i10 != -1) {
                        c5676n.f34616b.setTag(i10, null);
                    }
                    if (!this.f5251m) {
                        c0756d.f5257f.add(this);
                    }
                }
                if (this.f5247i < 1.0f || zM12042c) {
                    c0756d.f5252a.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j11 = jNanoTime2 - this.f5249k;
            this.f5249k = jNanoTime2;
            float f10 = this.f5247i - (((float) (j11 * 1.0E-6d)) * this.f5248j);
            this.f5247i = f10;
            if (f10 < 0.0f) {
                this.f5247i = 0.0f;
            }
            float interpolation = this.f5247i;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            boolean zM12042c2 = c5676n.m12042c(interpolation, jNanoTime2, c5676n.f34616b, this.f5243e);
            if (this.f5247i <= 0.0f) {
                if (i11 != -1) {
                    c5676n.f34616b.setTag(i11, Long.valueOf(System.nanoTime()));
                }
                if (i10 != -1) {
                    c5676n.f34616b.setTag(i10, null);
                }
                c0756d.f5257f.add(this);
            }
            if (this.f5247i > 0.0f || zM12042c2) {
                c0756d.f5252a.invalidate();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2853b() {
            this.f5246h = true;
            int i10 = this.f5242d;
            if (i10 != -1) {
                this.f5248j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            }
            this.f5244f.f5252a.invalidate();
            this.f5249k = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C0755c(Context context, XmlResourceParser xmlResourceParser) {
        byte b10;
        this.f5232o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (true) {
                int i10 = eventType;
                if (i10 != 1) {
                    if (i10 == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -1962203927:
                                b10 = !name.equals("ConstraintOverride") ? (byte) -1 : (byte) 2;
                                break;
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    b10 = 1;
                                }
                                break;
                            case 61998586:
                                if (name.equals("ViewTransition")) {
                                    b10 = 0;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    b10 = 4;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    b10 = 3;
                                }
                                break;
                            default:
                                break;
                        }
                        if (b10 == 0) {
                            m2851d(context, xmlResourceParser);
                        } else if (b10 == 1) {
                            this.f5223f = new C5669g(context, xmlResourceParser);
                        } else if (b10 == 2) {
                            this.f5224g = C0762b.m2882d(context, xmlResourceParser);
                        } else if (b10 == 3 || b10 == 4) {
                            ConstraintAttribute.m2856d(context, xmlResourceParser, this.f5224g.f5389g);
                        } else {
                            Log.e("ViewTransition", C5663a.m12018a() + " unknown tag " + name);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(".xml:");
                            sb2.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb2.toString());
                        }
                    } else if (i10 == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                        return;
                    }
                    eventType = xmlResourceParser.next();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2848a(C0756d c0756d, MotionLayout motionLayout, int i10, C0762b c0762b, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolatorC5683u;
        if (this.f5220c) {
            return;
        }
        int i11 = this.f5222e;
        C5669g c5669g = this.f5223f;
        if (i11 == 2) {
            View view = viewArr[0];
            C5676n c5676n = new C5676n(view);
            C5679q c5679q = c5676n.f34620f;
            c5679q.f34653c = 0.0f;
            c5679q.f34654d = 0.0f;
            c5676n.f34614H = true;
            c5679q.m12049i(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            c5676n.f34621g.m12049i(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            C5674l c5674l = c5676n.f34622h;
            c5674l.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            c5674l.m12037f(view);
            C5674l c5674l2 = c5676n.f34623i;
            c5674l2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            c5674l2.m12037f(view);
            ArrayList<AbstractC5666d> arrayList = c5669g.f34538a.get(-1);
            if (arrayList != null) {
                c5676n.f34637w.addAll(arrayList);
            }
            c5676n.m12044f(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i12 = this.f5225h;
            int i13 = this.f5226i;
            int i14 = this.f5219b;
            Context context = motionLayout.getContext();
            int i15 = this.f5229l;
            if (i15 != -2) {
                if (i15 == -1) {
                    interpolatorC5683u = new InterpolatorC5683u(C1660c.m5383c(this.f5230m));
                } else if (i15 == 0) {
                    interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                } else if (i15 == 1) {
                    interpolatorLoadInterpolator = new AccelerateInterpolator();
                } else if (i15 == 2) {
                    interpolatorLoadInterpolator = new DecelerateInterpolator();
                } else if (i15 == 4) {
                    interpolatorLoadInterpolator = new BounceInterpolator();
                } else if (i15 != 5) {
                    interpolatorLoadInterpolator = i15 != 6 ? null : new AnticipateInterpolator();
                } else {
                    interpolatorLoadInterpolator = new OvershootInterpolator();
                }
                new a(c0756d, c5676n, i12, i13, i14, interpolatorC5683u, this.f5233p, this.f5234q);
                return;
            }
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f5231n);
            interpolatorC5683u = interpolatorLoadInterpolator;
            new a(c0756d, c5676n, i12, i13, i14, interpolatorC5683u, this.f5233p, this.f5234q);
            return;
        }
        C0762b.a aVar = this.f5224g;
        if (i11 == 1) {
            for (int i16 : motionLayout.getConstraintSetIds()) {
                if (i16 != i10) {
                    C0762b c0762bM2809z = motionLayout.m2809z(i16);
                    for (View view2 : viewArr) {
                        C0762b.a aVarM2896j = c0762bM2809z.m2896j(view2.getId());
                        if (aVar != null) {
                            C0762b.a.C10592a c10592a = aVar.f5390h;
                            if (c10592a != null) {
                                c10592a.m2908e(aVarM2896j);
                            }
                            aVarM2896j.f5389g.putAll(aVar.f5389g);
                        }
                    }
                }
            }
        }
        C0762b c0762b2 = new C0762b();
        HashMap<Integer, C0762b.a> map = c0762b2.f5382f;
        map.clear();
        for (Integer num : c0762b.f5382f.keySet()) {
            C0762b.a aVar2 = c0762b.f5382f.get(num);
            if (aVar2 != null) {
                map.put(num, aVar2.clone());
            }
        }
        for (View view3 : viewArr) {
            C0762b.a aVarM2896j2 = c0762b2.m2896j(view3.getId());
            if (aVar != null) {
                C0762b.a.C10592a c10592a2 = aVar.f5390h;
                if (c10592a2 != null) {
                    c10592a2.m2908e(aVarM2896j2);
                }
                aVarM2896j2.f5389g.putAll(aVar.f5389g);
            }
        }
        motionLayout.m2800L(i10, c0762b2);
        motionLayout.m2800L(R.id.view_transition, c0762b);
        motionLayout.m2795G(R.id.view_transition);
        C0753a.b bVar = new C0753a.b(motionLayout.f5058L, i10);
        for (View view4 : viewArr) {
            int i17 = this.f5225h;
            if (i17 != -1) {
                bVar.f5172h = Math.max(i17, 8);
            }
            bVar.f5180p = this.f5221d;
            int i18 = this.f5229l;
            String str = this.f5230m;
            int i19 = this.f5231n;
            bVar.f5169e = i18;
            bVar.f5170f = str;
            bVar.f5171g = i19;
            int id2 = view4.getId();
            if (c5669g != null) {
                ArrayList<AbstractC5666d> arrayList2 = c5669g.f34538a.get(-1);
                C5669g c5669g2 = new C5669g();
                Iterator<AbstractC5666d> it = arrayList2.iterator();
                while (it.hasNext()) {
                    AbstractC5666d abstractC5666dClone = it.next().clone();
                    abstractC5666dClone.f34498b = id2;
                    c5669g2.m12031b(abstractC5666dClone);
                }
                bVar.f5175k.add(c5669g2);
            }
        }
        motionLayout.setTransition(bVar);
        RunnableC5682t runnableC5682t = new RunnableC5682t(this, 0, viewArr);
        motionLayout.m2803t(1.0f);
        motionLayout.f5067P0 = runnableC5682t;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2849b(View view) {
        int i10 = this.f5235r;
        boolean z10 = false;
        boolean z11 = i10 == -1 || view.getTag(i10) != null;
        int i11 = this.f5236s;
        boolean z12 = i11 == -1 || view.getTag(i11) == null;
        if (z11 && z12) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2850c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f5227j == -1 && this.f5228k == null) || !m2849b(view)) {
            return false;
        }
        if (view.getId() == this.f5227j) {
            return true;
        }
        if (this.f5228k == null) {
            return false;
        }
        return (view.getLayoutParams() instanceof ConstraintLayout.C0759b) && (str = ((ConstraintLayout.C0759b) view.getLayoutParams()).f5311Y) != null && str.matches(this.f5228k);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX INFO: renamed from: d */
    public final void m2851d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35190x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f5218a = typedArrayObtainStyledAttributes.getResourceId(index, this.f5218a);
            } else if (index == 8) {
                if (MotionLayout.f5046Z0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5227j);
                    this.f5227j = resourceId;
                    if (resourceId == -1) {
                        this.f5228k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f5228k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f5227j = typedArrayObtainStyledAttributes.getResourceId(index, this.f5227j);
                }
            } else if (index == 9) {
                this.f5219b = typedArrayObtainStyledAttributes.getInt(index, this.f5219b);
            } else if (index == 12) {
                this.f5220c = typedArrayObtainStyledAttributes.getBoolean(index, this.f5220c);
            } else if (index == 10) {
                this.f5221d = typedArrayObtainStyledAttributes.getInt(index, this.f5221d);
            } else if (index == 4) {
                this.f5225h = typedArrayObtainStyledAttributes.getInt(index, this.f5225h);
            } else if (index == 13) {
                this.f5226i = typedArrayObtainStyledAttributes.getInt(index, this.f5226i);
            } else if (index == 14) {
                this.f5222e = typedArrayObtainStyledAttributes.getInt(index, this.f5222e);
            } else if (index == 7) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f5231n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f5229l = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f5230m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f5229l = -1;
                    } else {
                        this.f5231n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f5229l = -2;
                    }
                } else {
                    this.f5229l = typedArrayObtainStyledAttributes.getInteger(index, this.f5229l);
                }
            } else if (index == 11) {
                this.f5233p = typedArrayObtainStyledAttributes.getResourceId(index, this.f5233p);
            } else if (index == 3) {
                this.f5234q = typedArrayObtainStyledAttributes.getResourceId(index, this.f5234q);
            } else if (index == 6) {
                this.f5235r = typedArrayObtainStyledAttributes.getResourceId(index, this.f5235r);
            } else if (index == 5) {
                this.f5236s = typedArrayObtainStyledAttributes.getResourceId(index, this.f5236s);
            } else if (index == 2) {
                this.f5238u = typedArrayObtainStyledAttributes.getResourceId(index, this.f5238u);
            } else if (index == 1) {
                this.f5237t = typedArrayObtainStyledAttributes.getInteger(index, this.f5237t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + C5663a.m12020c(this.f5218a, this.f5232o) + ")";
    }
}
