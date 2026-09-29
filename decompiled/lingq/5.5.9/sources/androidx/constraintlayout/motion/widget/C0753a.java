package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.AbstractC0761a;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0762b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.linguist.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p003a2.C0009a;
import p038c2.C1660c;
import p128g2.C5663a;
import p128g2.C5669g;
import p128g2.C5676n;
import p143h2.C5881d;
import p143h2.C5883f;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0753a {

    /* JADX INFO: renamed from: a */
    public final MotionLayout f5145a;

    /* JADX INFO: renamed from: b */
    public C5883f f5146b;

    /* JADX INFO: renamed from: c */
    public b f5147c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<b> f5148d;

    /* JADX INFO: renamed from: e */
    public b f5149e;

    /* JADX INFO: renamed from: f */
    public final ArrayList<b> f5150f;

    /* JADX INFO: renamed from: g */
    public final SparseArray<C0762b> f5151g;

    /* JADX INFO: renamed from: h */
    public final HashMap<String, Integer> f5152h;

    /* JADX INFO: renamed from: i */
    public final SparseIntArray f5153i;

    /* JADX INFO: renamed from: j */
    public int f5154j;

    /* JADX INFO: renamed from: k */
    public int f5155k;

    /* JADX INFO: renamed from: l */
    public MotionEvent f5156l;

    /* JADX INFO: renamed from: m */
    public boolean f5157m;

    /* JADX INFO: renamed from: n */
    public boolean f5158n;

    /* JADX INFO: renamed from: o */
    public MotionLayout.C0750g f5159o;

    /* JADX INFO: renamed from: p */
    public boolean f5160p;

    /* JADX INFO: renamed from: q */
    public final C0756d f5161q;

    /* JADX INFO: renamed from: r */
    public float f5162r;

    /* JADX INFO: renamed from: s */
    public float f5163s;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$a */
    public class a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1660c f5164a;

        public a(C1660c c1660c) {
            this.f5164a = c1660c;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f3) {
            return (float) this.f5164a.mo5384a(f3);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f5165a;

        /* JADX INFO: renamed from: b */
        public boolean f5166b;

        /* JADX INFO: renamed from: c */
        public int f5167c;

        /* JADX INFO: renamed from: d */
        public int f5168d;

        /* JADX INFO: renamed from: e */
        public int f5169e;

        /* JADX INFO: renamed from: f */
        public String f5170f;

        /* JADX INFO: renamed from: g */
        public int f5171g;

        /* JADX INFO: renamed from: h */
        public int f5172h;

        /* JADX INFO: renamed from: i */
        public float f5173i;

        /* JADX INFO: renamed from: j */
        public final C0753a f5174j;

        /* JADX INFO: renamed from: k */
        public final ArrayList<C5669g> f5175k;

        /* JADX INFO: renamed from: l */
        public C0754b f5176l;

        /* JADX INFO: renamed from: m */
        public final ArrayList<a> f5177m;

        /* JADX INFO: renamed from: n */
        public int f5178n;

        /* JADX INFO: renamed from: o */
        public boolean f5179o;

        /* JADX INFO: renamed from: p */
        public int f5180p;

        /* JADX INFO: renamed from: q */
        public int f5181q;

        /* JADX INFO: renamed from: r */
        public int f5182r;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$b$a */
        public static class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final b f5183a;

            /* JADX INFO: renamed from: b */
            public final int f5184b;

            /* JADX INFO: renamed from: c */
            public final int f5185c;

            public a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.f5184b = -1;
                this.f5185c = 17;
                this.f5183a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35182p);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == 1) {
                        this.f5184b = typedArrayObtainStyledAttributes.getResourceId(index, this.f5184b);
                    } else if (index == 0) {
                        this.f5185c = typedArrayObtainStyledAttributes.getInt(index, this.f5185c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            /* JADX INFO: renamed from: a */
            public final void m2843a(MotionLayout motionLayout, int i10, b bVar) {
                int i11 = this.f5184b;
                View viewFindViewById = motionLayout;
                if (i11 != -1) {
                    viewFindViewById = motionLayout.findViewById(i11);
                }
                if (viewFindViewById == null) {
                    Log.e("MotionScene", "OnClick could not find id " + i11);
                    return;
                }
                int i12 = bVar.f5168d;
                int i13 = bVar.f5167c;
                if (i12 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i14 = this.f5185c;
                int i15 = i14 & 1;
                boolean z10 = true;
                boolean z11 = (i15 != 0 && i10 == i12) | (i15 != 0 && i10 == i12) | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & 4096) == 0 || i10 != i13) {
                    z10 = false;
                }
                if (z11 || z10) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            /* JADX INFO: renamed from: b */
            public final void m2844b(MotionLayout motionLayout) {
                int i10 = this.f5184b;
                if (i10 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i10);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i10);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = this.f5183a;
                C0753a c0753a = bVar.f5174j;
                MotionLayout motionLayout = c0753a.f5145a;
                if (motionLayout.f5076U) {
                    if (bVar.f5168d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.m2799K(bVar.f5167c);
                            return;
                        }
                        b bVar2 = new b(bVar.f5174j, bVar);
                        bVar2.f5168d = currentState;
                        bVar2.f5167c = bVar.f5167c;
                        motionLayout.setTransition(bVar2);
                        motionLayout.m2798J();
                        return;
                    }
                    b bVar3 = c0753a.f5147c;
                    int i10 = this.f5185c;
                    boolean z10 = false;
                    boolean z11 = true;
                    boolean z12 = ((i10 & 1) == 0 && (i10 & 256) == 0) ? false : true;
                    boolean z13 = ((i10 & 16) == 0 && (i10 & 4096) == 0) ? false : true;
                    if (z12 && z13) {
                        if (bVar3 != bVar) {
                            motionLayout.setTransition(bVar);
                        }
                        if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                            z12 = false;
                        } else {
                            z13 = false;
                        }
                    }
                    if (bVar != bVar3) {
                        int i11 = bVar.f5167c;
                        int i12 = bVar.f5168d;
                        if (i12 != -1) {
                            int i13 = motionLayout.f5068Q;
                            if (i13 == i12 || i13 == i11) {
                                z10 = true;
                            }
                        } else if (motionLayout.f5068Q != i11) {
                            z10 = true;
                        }
                        z11 = z10;
                    }
                    if (z11) {
                        if (z12 && (i10 & 1) != 0) {
                            motionLayout.setTransition(bVar);
                            motionLayout.m2798J();
                            return;
                        }
                        if (z13 && (i10 & 16) != 0) {
                            motionLayout.setTransition(bVar);
                            motionLayout.m2803t(0.0f);
                        } else if (z12 && (i10 & 256) != 0) {
                            motionLayout.setTransition(bVar);
                            motionLayout.setProgress(1.0f);
                        } else if (z13 && (i10 & 4096) != 0) {
                            motionLayout.setTransition(bVar);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }
        }

        public b(C0753a c0753a, int i10) {
            this.f5165a = -1;
            this.f5166b = false;
            this.f5167c = -1;
            this.f5168d = -1;
            this.f5169e = 0;
            this.f5170f = null;
            this.f5171g = -1;
            this.f5172h = 400;
            this.f5173i = 0.0f;
            this.f5175k = new ArrayList<>();
            this.f5176l = null;
            this.f5177m = new ArrayList<>();
            this.f5178n = 0;
            this.f5179o = false;
            this.f5180p = -1;
            this.f5181q = 0;
            this.f5182r = 0;
            this.f5165a = -1;
            this.f5174j = c0753a;
            this.f5168d = R.id.view_transition;
            this.f5167c = i10;
            this.f5172h = c0753a.f5154j;
            this.f5181q = c0753a.f5155k;
        }

        public b(C0753a c0753a, Context context, XmlResourceParser xmlResourceParser) {
            this.f5165a = -1;
            this.f5166b = false;
            this.f5167c = -1;
            this.f5168d = -1;
            this.f5169e = 0;
            this.f5170f = null;
            this.f5171g = -1;
            this.f5172h = 400;
            this.f5173i = 0.0f;
            this.f5175k = new ArrayList<>();
            this.f5176l = null;
            this.f5177m = new ArrayList<>();
            this.f5178n = 0;
            this.f5179o = false;
            this.f5180p = -1;
            this.f5181q = 0;
            this.f5182r = 0;
            this.f5172h = c0753a.f5154j;
            this.f5181q = c0753a.f5155k;
            this.f5174j = c0753a;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35188v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                SparseArray<C0762b> sparseArray = c0753a.f5151g;
                if (index == 2) {
                    this.f5167c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f5167c);
                    if ("layout".equals(resourceTypeName)) {
                        C0762b c0762b = new C0762b();
                        c0762b.m2897k(this.f5167c, context);
                        sparseArray.append(this.f5167c, c0762b);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f5167c = c0753a.m2837i(this.f5167c, context);
                    }
                } else if (index == 3) {
                    this.f5168d = typedArrayObtainStyledAttributes.getResourceId(index, this.f5168d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f5168d);
                    if ("layout".equals(resourceTypeName2)) {
                        C0762b c0762b2 = new C0762b();
                        c0762b2.m2897k(this.f5168d, context);
                        sparseArray.append(this.f5168d, c0762b2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f5168d = c0753a.m2837i(this.f5168d, context);
                    }
                } else if (index == 6) {
                    int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f5171g = resourceId;
                        if (resourceId != -1) {
                            this.f5169e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f5170f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f5171g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f5169e = -2;
                            } else {
                                this.f5169e = -1;
                            }
                        }
                    } else {
                        this.f5169e = typedArrayObtainStyledAttributes.getInteger(index, this.f5169e);
                    }
                } else if (index == 4) {
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f5172h);
                    this.f5172h = i12;
                    if (i12 < 8) {
                        this.f5172h = 8;
                    }
                } else if (index == 8) {
                    this.f5173i = typedArrayObtainStyledAttributes.getFloat(index, this.f5173i);
                } else if (index == 1) {
                    this.f5178n = typedArrayObtainStyledAttributes.getInteger(index, this.f5178n);
                } else if (index == 0) {
                    this.f5165a = typedArrayObtainStyledAttributes.getResourceId(index, this.f5165a);
                } else if (index == 9) {
                    this.f5179o = typedArrayObtainStyledAttributes.getBoolean(index, this.f5179o);
                } else if (index == 7) {
                    this.f5180p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f5181q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f5182r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f5168d == -1) {
                this.f5166b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public b(C0753a c0753a, b bVar) {
            this.f5165a = -1;
            this.f5166b = false;
            this.f5167c = -1;
            this.f5168d = -1;
            this.f5169e = 0;
            this.f5170f = null;
            this.f5171g = -1;
            this.f5172h = 400;
            this.f5173i = 0.0f;
            this.f5175k = new ArrayList<>();
            this.f5176l = null;
            this.f5177m = new ArrayList<>();
            this.f5178n = 0;
            this.f5179o = false;
            this.f5180p = -1;
            this.f5181q = 0;
            this.f5182r = 0;
            this.f5174j = c0753a;
            this.f5172h = c0753a.f5154j;
            if (bVar != null) {
                this.f5180p = bVar.f5180p;
                this.f5169e = bVar.f5169e;
                this.f5170f = bVar.f5170f;
                this.f5171g = bVar.f5171g;
                this.f5172h = bVar.f5172h;
                this.f5175k = bVar.f5175k;
                this.f5173i = bVar.f5173i;
                this.f5181q = bVar.f5181q;
            }
        }
    }

    public C0753a(Context context, MotionLayout motionLayout, int i10) {
        this.f5146b = null;
        this.f5147c = null;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f5148d = arrayList;
        this.f5149e = null;
        this.f5150f = new ArrayList<>();
        this.f5151g = new SparseArray<>();
        this.f5152h = new HashMap<>();
        this.f5153i = new SparseIntArray();
        this.f5154j = 400;
        this.f5155k = 0;
        this.f5157m = false;
        this.f5158n = false;
        this.f5145a = motionLayout;
        this.f5161q = new C0756d(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    switch (xml.getName()) {
                        case "MotionScene":
                            m2839k(context, xml);
                            break;
                        case "Transition":
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.f5147c == null && !bVar.f5166b) {
                                this.f5147c = bVar;
                                C0754b c0754b = bVar.f5176l;
                                if (c0754b != null) {
                                    c0754b.m2847c(this.f5160p);
                                }
                            }
                            if (!bVar.f5166b) {
                                break;
                            } else {
                                if (bVar.f5167c == -1) {
                                    this.f5149e = bVar;
                                } else {
                                    this.f5150f.add(bVar);
                                }
                                arrayList.remove(bVar);
                                break;
                            }
                            break;
                        case "OnSwipe":
                            if (bVar == null) {
                                Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i10) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f5176l = new C0754b(context, this.f5145a, xml);
                                break;
                            }
                            break;
                        case "OnClick":
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f5177m.add(new b.a(context, bVar, xml));
                                break;
                            }
                            break;
                        case "StateSet":
                            this.f5146b = new C5883f(context, xml);
                            break;
                        case "ConstraintSet":
                            m2836h(context, xml);
                            break;
                        case "include":
                        case "Include":
                            m2838j(context, xml);
                            break;
                        case "KeyFrameSet":
                            C5669g c5669g = new C5669g(context, xml);
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f5175k.add(c5669g);
                                break;
                            }
                            break;
                        case "ViewTransition":
                            C0755c c0755c = new C0755c(context, xml);
                            C0756d c0756d = this.f5161q;
                            c0756d.f5253b.add(c0755c);
                            c0756d.f5254c = null;
                            int i11 = c0755c.f5219b;
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    C0756d.m2854a(c0755c, false);
                                }
                                break;
                            } else {
                                C0756d.m2854a(c0755c, true);
                                break;
                            }
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        this.f5151g.put(R.id.motion_base, new C0762b());
        this.f5152h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2829a(int i10, MotionLayout motionLayout) {
        if (this.f5159o != null) {
            return false;
        }
        for (b bVar : this.f5148d) {
            int i11 = bVar.f5178n;
            if (i11 != 0) {
                b bVar2 = this.f5147c;
                if (bVar2 == bVar) {
                    if ((bVar2.f5182r & 2) != 0) {
                    }
                }
                if (i10 == bVar.f5168d && (i11 == 4 || i11 == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(bVar);
                    if (bVar.f5178n == 4) {
                        motionLayout.m2798J();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.m2805v(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.m2792D();
                    }
                    return true;
                }
                if (i10 != bVar.f5167c || (i11 != 3 && i11 != 1)) {
                }
                MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                motionLayout.setState(transitionState2);
                motionLayout.setTransition(bVar);
                if (bVar.f5178n == 3) {
                    motionLayout.m2803t(0.0f);
                    motionLayout.setState(MotionLayout.TransitionState.SETUP);
                    motionLayout.setState(MotionLayout.TransitionState.MOVING);
                } else {
                    motionLayout.setProgress(0.0f);
                    motionLayout.m2805v(true);
                    motionLayout.setState(MotionLayout.TransitionState.SETUP);
                    motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    motionLayout.setState(transitionState2);
                    motionLayout.m2792D();
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final C0762b m2830b(int i10) {
        int iM12311a;
        SparseArray<C0762b> sparseArray = this.f5151g;
        C5883f c5883f = this.f5146b;
        if (c5883f != null && (iM12311a = c5883f.m12311a(i10)) != -1) {
            i10 = iM12311a;
        }
        if (sparseArray.get(i10) != null) {
            return sparseArray.get(i10);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + C5663a.m12020c(i10, this.f5145a.getContext()) + " In MotionScene");
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* JADX INFO: renamed from: c */
    public final int m2831c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    /* JADX INFO: renamed from: d */
    public final Interpolator m2832d() {
        b bVar = this.f5147c;
        int i10 = bVar.f5169e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f5145a.getContext(), this.f5147c.f5171g);
        }
        if (i10 == -1) {
            return new a(C1660c.m5383c(bVar.f5170f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* JADX INFO: renamed from: e */
    public final void m2833e(C5676n c5676n) {
        b bVar = this.f5147c;
        if (bVar != null) {
            Iterator<C5669g> it = bVar.f5175k.iterator();
            while (it.hasNext()) {
                it.next().m12030a(c5676n);
            }
        } else {
            b bVar2 = this.f5149e;
            if (bVar2 != null) {
                Iterator<C5669g> it2 = bVar2.f5175k.iterator();
                while (it2.hasNext()) {
                    it2.next().m12030a(c5676n);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final float m2834f() {
        C0754b c0754b;
        b bVar = this.f5147c;
        if (bVar == null || (c0754b = bVar.f5176l) == null) {
            return 0.0f;
        }
        return c0754b.f5211t;
    }

    /* JADX INFO: renamed from: g */
    public final int m2835g() {
        b bVar = this.f5147c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f5168d;
    }

    /* JADX INFO: renamed from: h */
    public final int m2836h(Context context, XmlResourceParser xmlResourceParser) {
        C0762b c0762b = new C0762b();
        c0762b.f5381e = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iM2831c = -1;
        int iM2831c2 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iM2831c2 = m2831c(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        c0762b.f5379c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                c0762b.f5379c = 4;
                                break;
                            case "left":
                                c0762b.f5379c = 2;
                                break;
                            case "none":
                                c0762b.f5379c = 0;
                                break;
                            case "right":
                                c0762b.f5379c = 1;
                                break;
                            case "x_right":
                                c0762b.f5379c = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iM2831c = m2831c(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f5152h.put(attributeValue, Integer.valueOf(iM2831c));
                    c0762b.f5377a = C5663a.m12020c(iM2831c, context);
                    break;
            }
        }
        if (iM2831c != -1) {
            int i11 = this.f5145a.f5092i0;
            c0762b.m2898l(context, xmlResourceParser);
            if (iM2831c2 != -1) {
                this.f5153i.put(iM2831c, iM2831c2);
            }
            this.f5151g.put(iM2831c, c0762b);
        }
        return iM2831c;
    }

    /* JADX INFO: renamed from: i */
    public final int m2837i(int i10, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return m2836h(context, xml);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m2838j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35191y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                m2837i(typedArrayObtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: k */
    public final void m2839k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35181o);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f5154j);
                this.f5154j = i11;
                if (i11 < 8) {
                    this.f5154j = 8;
                }
            } else if (index == 1) {
                this.f5155k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    public final void m2840l(int i10, MotionLayout motionLayout) {
        SparseArray<C0762b> sparseArray = this.f5151g;
        C0762b c0762b = sparseArray.get(i10);
        c0762b.f5378b = c0762b.f5377a;
        int i11 = this.f5153i.get(i10);
        HashMap<Integer, C0762b.a> map = c0762b.f5382f;
        if (i11 > 0) {
            m2840l(i11, motionLayout);
            C0762b c0762b2 = sparseArray.get(i11);
            if (c0762b2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + C5663a.m12020c(i11, this.f5145a.getContext()));
                return;
            }
            c0762b.f5378b += "/" + c0762b2.f5378b;
            HashMap<Integer, C0762b.a> map2 = c0762b2.f5382f;
            for (Integer num : map2.keySet()) {
                int iIntValue = num.intValue();
                C0762b.a aVar = map2.get(num);
                if (!map.containsKey(Integer.valueOf(iIntValue))) {
                    map.put(Integer.valueOf(iIntValue), new C0762b.a());
                }
                C0762b.a aVar2 = map.get(Integer.valueOf(iIntValue));
                if (aVar2 != null) {
                    C0762b.b bVar = aVar2.f5387e;
                    if (!bVar.f5432b) {
                        bVar.m2909a(aVar.f5387e);
                    }
                    C0762b.d dVar = aVar2.f5385c;
                    if (!dVar.f5486a) {
                        C0762b.d dVar2 = aVar.f5385c;
                        dVar.f5486a = dVar2.f5486a;
                        dVar.f5487b = dVar2.f5487b;
                        dVar.f5489d = dVar2.f5489d;
                        dVar.f5490e = dVar2.f5490e;
                        dVar.f5488c = dVar2.f5488c;
                    }
                    C0762b.e eVar = aVar2.f5388f;
                    if (!eVar.f5492a) {
                        eVar.m2914a(aVar.f5388f);
                    }
                    C0762b.c cVar = aVar2.f5386d;
                    if (!cVar.f5473a) {
                        cVar.m2911a(aVar.f5386d);
                    }
                    for (String str : aVar.f5389g.keySet()) {
                        if (!aVar2.f5389g.containsKey(str)) {
                            aVar2.f5389g.put(str, aVar.f5389g.get(str));
                        }
                    }
                }
            }
        } else {
            c0762b.f5378b = C0009a.m23l(new StringBuilder(), c0762b.f5378b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = motionLayout.getChildAt(i12);
                ConstraintLayout.C0759b c0759b = (ConstraintLayout.C0759b) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (c0762b.f5381e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id2))) {
                    map.put(Integer.valueOf(id2), new C0762b.a());
                }
                C0762b.a aVar3 = map.get(Integer.valueOf(id2));
                if (aVar3 != null) {
                    C0762b.b bVar2 = aVar3.f5387e;
                    if (!bVar2.f5432b) {
                        aVar3.m2902c(id2, c0759b);
                        if (childAt instanceof AbstractC0761a) {
                            bVar2.f5449j0 = ((AbstractC0761a) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                bVar2.f5459o0 = barrier.getAllowsGoneWidget();
                                bVar2.f5443g0 = barrier.getType();
                                bVar2.f5445h0 = barrier.getMargin();
                            }
                        }
                        bVar2.f5432b = true;
                    }
                    C0762b.d dVar3 = aVar3.f5385c;
                    if (!dVar3.f5486a) {
                        dVar3.f5487b = childAt.getVisibility();
                        dVar3.f5489d = childAt.getAlpha();
                        dVar3.f5486a = true;
                    }
                    C0762b.e eVar2 = aVar3.f5388f;
                    if (!eVar2.f5492a) {
                        eVar2.f5492a = true;
                        eVar2.f5493b = childAt.getRotation();
                        eVar2.f5494c = childAt.getRotationX();
                        eVar2.f5495d = childAt.getRotationY();
                        eVar2.f5496e = childAt.getScaleX();
                        eVar2.f5497f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            eVar2.f5498g = pivotX;
                            eVar2.f5499h = pivotY;
                        }
                        eVar2.f5501j = childAt.getTranslationX();
                        eVar2.f5502k = childAt.getTranslationY();
                        eVar2.f5503l = childAt.getTranslationZ();
                        if (eVar2.f5504m) {
                            eVar2.f5505n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (C0762b.a aVar4 : map.values()) {
            if (aVar4.f5390h != null) {
                if (aVar4.f5384b != null) {
                    Iterator<Integer> it = map.keySet().iterator();
                    while (it.hasNext()) {
                        C0762b.a aVarM2896j = c0762b.m2896j(it.next().intValue());
                        String str2 = aVarM2896j.f5387e.f5453l0;
                        if (str2 != null && aVar4.f5384b.matches(str2)) {
                            aVar4.f5390h.m2908e(aVarM2896j);
                            aVarM2896j.f5389g.putAll((HashMap) aVar4.f5389g.clone());
                        }
                    }
                } else {
                    aVar4.f5390h.m2908e(c0762b.m2896j(aVar4.f5383a));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089 A[LOOP:2: B:38:0x0075->B:42:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0035 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x008c A[EDGE_INSN: B:55:0x008c->B:43:0x008c BREAK  A[LOOP:1: B:37:0x0074->B:56:?, LOOP_LABEL: LOOP:1: B:37:0x0074->B:56:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public final void m2841m(int i10, int i11) {
        int iM12311a;
        int iM12311a2;
        b bVar;
        ArrayList<b> arrayList;
        Iterator<b> it;
        b bVar2;
        Iterator<b> it2;
        b bVar3;
        b next;
        b next2;
        int i12;
        C0754b c0754b;
        C5883f c5883f = this.f5146b;
        if (c5883f != null) {
            iM12311a = c5883f.m12311a(i10);
            if (iM12311a == -1) {
                iM12311a = i10;
            }
            iM12311a2 = this.f5146b.m12311a(i11);
            if (iM12311a2 == -1) {
            }
            bVar = this.f5147c;
            if (bVar == null && bVar.f5167c == i11 && bVar.f5168d == i10) {
                return;
            }
            arrayList = this.f5148d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.f5149e;
                    it2 = this.f5150f.iterator();
                    loop1: while (true) {
                        while (true) {
                            if (it2.hasNext()) {
                                break loop1;
                            }
                            next = it2.next();
                            if (next.f5167c == i11) {
                                bVar2 = next;
                            }
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.f5168d = iM12311a;
                    bVar3.f5167c = iM12311a2;
                    if (iM12311a != -1) {
                        arrayList.add(bVar3);
                    }
                    this.f5147c = bVar3;
                    return;
                }
                next2 = it.next();
                i12 = next2.f5167c;
                if (i12 != iM12311a2 && next2.f5168d == iM12311a) {
                    break;
                } else if (i12 != i11 && next2.f5168d == i10) {
                    break;
                }
            }
            this.f5147c = next2;
            c0754b = next2.f5176l;
            if (c0754b != null) {
                c0754b.m2847c(this.f5160p);
            }
        }
        iM12311a = i10;
        iM12311a2 = i11;
        bVar = this.f5147c;
        if (bVar == null) {
        }
        arrayList = this.f5148d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.f5149e;
                it2 = this.f5150f.iterator();
                loop1: while (true) {
                    while (true) {
                        if (it2.hasNext()) {
                            break loop1;
                            break loop1;
                        } else {
                            next = it2.next();
                            if (next.f5167c == i11) {
                                bVar2 = next;
                            }
                        }
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.f5168d = iM12311a;
                bVar3.f5167c = iM12311a2;
                if (iM12311a != -1) {
                    arrayList.add(bVar3);
                }
                this.f5147c = bVar3;
                return;
            }
            next2 = it.next();
            i12 = next2.f5167c;
            if (i12 != iM12311a2) {
                if (i12 != i11) {
                }
            } else if (i12 != i11) {
            }
        }
        this.f5147c = next2;
        c0754b = next2.f5176l;
        if (c0754b != null) {
            c0754b.m2847c(this.f5160p);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2842n() {
        Iterator<b> it = this.f5148d.iterator();
        while (it.hasNext()) {
            if (it.next().f5176l != null) {
                return true;
            }
        }
        b bVar = this.f5147c;
        return (bVar == null || bVar.f5176l == null) ? false : true;
    }
}
