package p000;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ig0 extends tad {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ im1 f44066b;

    public /* synthetic */ ig0(im1 im1Var, int i) {
        this.f44065a = i;
        this.f44066b = im1Var;
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: a */
    public final int mo13885a(View view, int i) {
        int iM20949a;
        int i2;
        switch (this.f44065a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f44066b;
                rw4 rw4Var = sideSheetBehavior.f13085a;
                switch (rw4Var.f59961a) {
                    case 0:
                        iM20949a = -rw4Var.f59962b.f13096l;
                        break;
                    default:
                        iM20949a = rw4Var.m20949a();
                        break;
                }
                rw4 rw4Var2 = sideSheetBehavior.f13085a;
                switch (rw4Var2.f59961a) {
                    case 0:
                        i2 = rw4Var2.f59962b.f13099o;
                        break;
                    default:
                        i2 = rw4Var2.f59962b.f13097m;
                        break;
                }
                return AbstractC3584sr.m21645x(i, iM20949a, i2);
        }
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: b */
    public final int mo13886b(View view, int i) {
        switch (this.f44065a) {
            case 0:
                return AbstractC3584sr.m21645x(i, ((BottomSheetBehavior) this.f44066b).m6024E(), mo13888d());
            default:
                return view.getTop();
        }
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: c */
    public int mo13887c(View view) {
        switch (this.f44065a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f44066b;
                return sideSheetBehavior.f13096l + sideSheetBehavior.f13099o;
            default:
                return super.mo13887c(view);
        }
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: d */
    public int mo13888d() {
        switch (this.f44065a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f44066b;
                int i = BottomSheetBehavior.f12683l0;
                return bottomSheetBehavior.f12693J ? bottomSheetBehavior.f12706W : bottomSheetBehavior.f12691H;
            default:
                return super.mo13888d();
        }
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: f */
    public final void mo13889f(int i) {
        int i2 = this.f44065a;
        im1 im1Var = this.f44066b;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) im1Var;
                    if (bottomSheetBehavior.f12695L) {
                        bottomSheetBehavior.m6033N(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) im1Var;
                    if (sideSheetBehavior.f13091g) {
                        sideSheetBehavior.m6167x(1);
                    }
                }
                break;
        }
    }

    @Override // p000.tad
    /* JADX INFO: renamed from: g */
    public final void mo13890g(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.f44065a;
        im1 im1Var = this.f44066b;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) im1Var).m6023A(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) im1Var;
                WeakReference weakReference = sideSheetBehavior.f13101q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    rw4 rw4Var = sideSheetBehavior.f13085a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (rw4Var.f59961a) {
                        case 0:
                            if (left <= rw4Var.f59962b.f13097m) {
                                marginLayoutParams.leftMargin = right;
                            }
                            break;
                        default:
                            int i4 = rw4Var.f59962b.f13097m;
                            if (left <= i4) {
                                marginLayoutParams.rightMargin = i4 - left;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f13106v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                rw4 rw4Var2 = sideSheetBehavior.f13085a;
                switch (rw4Var2.f59961a) {
                    case 0:
                        rw4Var2.m20950b();
                        rw4Var2.m20949a();
                        break;
                    default:
                        int i5 = rw4Var2.f59962b.f13097m;
                        rw4Var2.m20949a();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw wq1.m24110f(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c A[PHI: r2
      0x013c: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v0 int), (r2v0 int) binds: [B:108:0x01c6, B:100:0x01a7, B:92:0x0177, B:95:0x018d, B:77:0x013a, B:75:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    @Override // p000.tad
    /* JADX INFO: renamed from: h */
    public final void mo13891h(View view, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f44065a;
        int i2 = 3;
        int i3 = 5;
        im1 im1Var = this.f44066b;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) im1Var;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.f12712b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        if (top > bottomSheetBehavior.f12689F) {
                            i2 = 6;
                        }
                    }
                } else if (!bottomSheetBehavior.f12693J || !bottomSheetBehavior.m6034O(view, f2)) {
                    i3 = 4;
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (!bottomSheetBehavior.f12712b) {
                            int i4 = bottomSheetBehavior.f12689F;
                            if (top2 < i4) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f12691H)) {
                                }
                            } else if (Math.abs(top2 - i4) >= Math.abs(top2 - bottomSheetBehavior.f12691H)) {
                                i2 = i3;
                            }
                            i2 = 6;
                        } else if (Math.abs(top2 - bottomSheetBehavior.f12688E) >= Math.abs(top2 - bottomSheetBehavior.f12691H)) {
                            i2 = i3;
                        }
                    } else {
                        if (!bottomSheetBehavior.f12712b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f12689F) < Math.abs(top3 - bottomSheetBehavior.f12691H)) {
                                i2 = 6;
                            }
                        }
                        i2 = i3;
                    }
                } else if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.f12716d) {
                    if (view.getTop() > (bottomSheetBehavior.m6024E() + bottomSheetBehavior.f12706W) / 2) {
                        i2 = i3;
                    } else if (!bottomSheetBehavior.f12712b && Math.abs(view.getTop() - bottomSheetBehavior.m6024E()) >= Math.abs(view.getTop() - bottomSheetBehavior.f12689F)) {
                        i2 = 6;
                    }
                } else {
                    i2 = i3;
                }
                bottomSheetBehavior.m6035P(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) im1Var;
                boolean z4 = false;
                switch (sideSheetBehavior.f13085a.f59961a) {
                    case 0:
                        if (f <= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                    default:
                        if (f >= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                }
                if (!z) {
                    rw4 rw4Var = sideSheetBehavior.f13085a;
                    switch (rw4Var.f59961a) {
                        case 0:
                            if (Math.abs((rw4Var.f59962b.f13095k * f) + view.getLeft()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                        default:
                            if (Math.abs((rw4Var.f59962b.f13095k * f) + view.getRight()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                    }
                    if (z2) {
                        switch (sideSheetBehavior.f13085a.f59961a) {
                            case 0:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                            default:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                        }
                        if (z3) {
                            i2 = 5;
                        } else {
                            rw4 rw4Var2 = sideSheetBehavior.f13085a;
                            switch (rw4Var2.f59961a) {
                                case 0:
                                    if (view.getRight() < (rw4Var2.m20949a() - rw4Var2.m20950b()) / 2) {
                                        z4 = true;
                                    }
                                    break;
                                default:
                                    if (view.getLeft() > (rw4Var2.m20949a() + rw4Var2.f59962b.f13097m) / 2) {
                                        z4 = true;
                                    }
                                    break;
                            }
                            if (z4) {
                                i2 = 5;
                            }
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.f13085a.m20949a()) >= Math.abs(left - sideSheetBehavior.f13085a.m20950b())) {
                            i2 = 5;
                        }
                    } else {
                        i2 = 5;
                    }
                }
                sideSheetBehavior.m6169z(view, i2, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    @Override // p000.tad
    /* JADX INFO: renamed from: i */
    public final boolean mo13892i(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int i2 = this.f44065a;
        im1 im1Var = this.f44066b;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) im1Var;
                int i3 = bottomSheetBehavior.f12698O;
                if (i3 != 1 && !bottomSheetBehavior.f12721f0) {
                    if (i3 == 3 && bottomSheetBehavior.f12715c0 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.f12718e) {
                            WeakReference weakReference3 = bottomSheetBehavior.f12719e0;
                            if (weakReference3 != null) {
                                view2 = (View) weakReference3.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.f12708Y;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            SystemClock.uptimeMillis();
                            weakReference = bottomSheetBehavior.f12707X;
                            if (weakReference != null) {
                                return true;
                            }
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        weakReference = bottomSheetBehavior.f12707X;
                        if (weakReference != null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) im1Var;
                return (sideSheetBehavior.f13092h == 1 || (weakReference2 = sideSheetBehavior.f13100p) == null || weakReference2.get() != view) ? false : true;
        }
    }
}
