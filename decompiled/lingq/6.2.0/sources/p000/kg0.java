package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.common.base.AbstractC1082b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47154a;

    /* JADX INFO: renamed from: b */
    public int f47155b;

    /* JADX INFO: renamed from: c */
    public boolean f47156c;

    /* JADX INFO: renamed from: d */
    public final Object f47157d;

    /* JADX INFO: renamed from: e */
    public final Object f47158e;

    public kg0(SideSheetBehavior sideSheetBehavior) {
        this.f47154a = 1;
        this.f47158e = sideSheetBehavior;
        this.f47157d = new mt6(this, 8);
    }

    /* JADX INFO: renamed from: c */
    public static kg0 m15170c(String str) {
        bna.m3967p("The separator may not be the empty string.", str.length() != 0);
        return str.length() == 1 ? new kg0(new vf9(new su0(str.charAt(0)))) : new kg0(new C2920da(str, 4));
    }

    /* JADX INFO: renamed from: a */
    public void m15171a(int i) {
        int i2 = this.f47154a;
        Object obj = this.f47157d;
        Object obj2 = this.f47158e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f12707X;
                if (weakReference != null && weakReference.get() != null) {
                    this.f47155b = i;
                    if (!this.f47156c) {
                        ((View) bottomSheetBehavior.f12707X.get()).postOnAnimation((RunnableC3468pp) obj);
                        this.f47156c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f13100p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f47155b = i;
                    if (!this.f47156c) {
                        ((View) sideSheetBehavior.f13100p.get()).postOnAnimation((mt6) obj);
                        this.f47156c = true;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public kg0 m15172b() {
        return new kg0((xf9) this.f47158e, true, (ru0) this.f47157d, this.f47155b);
    }

    /* JADX INFO: renamed from: d */
    public wf9 m15173d(String str) {
        return new wf9(this, str);
    }

    /* JADX INFO: renamed from: e */
    public List m15174e(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itMo10172a = ((xf9) this.f47158e).mo10172a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC1082b abstractC1082b = (AbstractC1082b) itMo10172a;
            if (!abstractC1082b.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) abstractC1082b.next());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kg0(xf9 xf9Var) {
        this(xf9Var, false, tu0.f62876b, Integer.MAX_VALUE);
        this.f47154a = 2;
    }

    public kg0(xf9 xf9Var, boolean z, ru0 ru0Var, int i) {
        this.f47154a = 2;
        this.f47158e = xf9Var;
        this.f47156c = z;
        this.f47157d = ru0Var;
        this.f47155b = i;
    }

    public kg0(BottomSheetBehavior bottomSheetBehavior) {
        this.f47154a = 0;
        this.f47158e = bottomSheetBehavior;
        this.f47157d = new RunnableC3468pp(this, 2);
    }
}
