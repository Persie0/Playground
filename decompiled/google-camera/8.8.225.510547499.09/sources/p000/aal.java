package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aal extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public aai f14a;

    /* JADX INFO: renamed from: b */
    public boolean f15b;

    /* JADX INFO: renamed from: c */
    public int f16c;

    /* JADX INFO: renamed from: d */
    public int f17d;

    /* JADX INFO: renamed from: e */
    public int f18e;

    /* JADX INFO: renamed from: f */
    public int f19f;

    /* JADX INFO: renamed from: g */
    public int f20g;

    /* JADX INFO: renamed from: h */
    public int f21h;

    /* JADX INFO: renamed from: i */
    public int f22i;

    /* JADX INFO: renamed from: j */
    public int f23j;

    /* JADX INFO: renamed from: k */
    public View f24k;

    /* JADX INFO: renamed from: l */
    public View f25l;

    /* JADX INFO: renamed from: m */
    public boolean f26m;

    /* JADX INFO: renamed from: n */
    public boolean f27n;

    /* JADX INFO: renamed from: o */
    public boolean f28o;

    /* JADX INFO: renamed from: p */
    public final Rect f29p;

    /* JADX INFO: renamed from: q */
    private boolean f30q;

    public aal() {
        super(-2, -2);
        this.f15b = false;
        this.f16c = 0;
        this.f17d = 0;
        this.f18e = -1;
        this.f19f = -1;
        this.f20g = 0;
        this.f21h = 0;
        this.f29p = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final void m23a() {
        this.f28o = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m24b(aai aaiVar) {
        aai aaiVar2 = this.f14a;
        if (aaiVar2 != aaiVar) {
            if (aaiVar2 != null) {
                aaiVar2.mo5b();
            }
            this.f14a = aaiVar;
            this.f15b = true;
            if (aaiVar != null) {
                aaiVar.mo4a(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m25c(int i, boolean z) {
        switch (i) {
            case 0:
                this.f27n = z;
                break;
            default:
                this.f30q = z;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26d(int i) {
        switch (i) {
            case 0:
                return this.f27n;
            default:
                return this.f30q;
        }
    }

    public aal(Context context, AttributeSet attributeSet) {
        aai aaiVar;
        super(context, attributeSet);
        this.f15b = false;
        this.f16c = 0;
        this.f17d = 0;
        this.f18e = -1;
        this.f19f = -1;
        this.f20g = 0;
        this.f21h = 0;
        this.f29p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aag.f12b);
        this.f16c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f19f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f17d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f18e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f20g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f21h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f15b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            if (TextUtils.isEmpty(string)) {
                aaiVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = String.valueOf(context.getPackageName()).concat(String.valueOf(string));
                } else if (string.indexOf(46) < 0 && !TextUtils.isEmpty(CoordinatorLayout.f1445a)) {
                    string = CoordinatorLayout.f1445a + '.' + string;
                }
                try {
                    Map map = (Map) CoordinatorLayout.f1447c.get();
                    if (map == null) {
                        map = new HashMap();
                        CoordinatorLayout.f1447c.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1446b);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aaiVar = (aai) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(string)), e);
                }
            }
            this.f14a = aaiVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        aai aaiVar2 = this.f14a;
        if (aaiVar2 != null) {
            aaiVar2.mo4a(this);
        }
    }

    public aal(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f15b = false;
        this.f16c = 0;
        this.f17d = 0;
        this.f18e = -1;
        this.f19f = -1;
        this.f20g = 0;
        this.f21h = 0;
        this.f29p = new Rect();
    }

    public aal(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f15b = false;
        this.f16c = 0;
        this.f17d = 0;
        this.f18e = -1;
        this.f19f = -1;
        this.f20g = 0;
        this.f21h = 0;
        this.f29p = new Rect();
    }

    public aal(aal aalVar) {
        super((ViewGroup.MarginLayoutParams) aalVar);
        this.f15b = false;
        this.f16c = 0;
        this.f17d = 0;
        this.f18e = -1;
        this.f19f = -1;
        this.f20g = 0;
        this.f21h = 0;
        this.f29p = new Rect();
    }
}
