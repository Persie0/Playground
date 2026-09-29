package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import p471x2.C10026a;
import p497y2.C10284f;
import p497y2.C10285g;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1149e0 extends C10026a {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f7250d;

    /* JADX INFO: renamed from: e */
    public final a f7251e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e0$a */
    public static class a extends C10026a {

        /* JADX INFO: renamed from: d */
        public final C1149e0 f7252d;

        /* JADX INFO: renamed from: e */
        public final WeakHashMap f7253e = new WeakHashMap();

        public a(C1149e0 c1149e0) {
            this.f7252d = c1149e0;
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: a */
        public final boolean mo4450a(View view, AccessibilityEvent accessibilityEvent) {
            C10026a c10026a = (C10026a) this.f7253e.get(view);
            return c10026a != null ? c10026a.mo4450a(view, accessibilityEvent) : super.mo4450a(view, accessibilityEvent);
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: b */
        public final C10285g mo2287b(View view) {
            C10026a c10026a = (C10026a) this.f7253e.get(view);
            return c10026a != null ? c10026a.mo2287b(view) : super.mo2287b(view);
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: c */
        public final void mo2998c(View view, AccessibilityEvent accessibilityEvent) {
            C10026a c10026a = (C10026a) this.f7253e.get(view);
            if (c10026a != null) {
                c10026a.mo2998c(view, accessibilityEvent);
            } else {
                super.mo2998c(view, accessibilityEvent);
            }
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: d */
        public final void mo2999d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C10284f c10284f) {
            C1149e0 c1149e0 = this.f7252d;
            RecyclerView recyclerView = c1149e0.f7250d;
            boolean z10 = !recyclerView.f6989Q || recyclerView.f7007c0 || recyclerView.f7010e.m4417g();
            AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
            View.AccessibilityDelegate accessibilityDelegate = this.f50989a;
            if (!z10) {
                RecyclerView recyclerView2 = c1149e0.f7250d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().m4310Z(view, c10284f);
                    C10026a c10026a = (C10026a) this.f7253e.get(view);
                    if (c10026a != null) {
                        c10026a.mo2999d(view, c10284f);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: e */
        public final void mo4451e(View view, AccessibilityEvent accessibilityEvent) {
            C10026a c10026a = (C10026a) this.f7253e.get(view);
            if (c10026a != null) {
                c10026a.mo4451e(view, accessibilityEvent);
            } else {
                super.mo4451e(view, accessibilityEvent);
            }
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: f */
        public final boolean mo4452f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C10026a c10026a = (C10026a) this.f7253e.get(viewGroup);
            return c10026a != null ? c10026a.mo4452f(viewGroup, view, accessibilityEvent) : super.mo4452f(viewGroup, view, accessibilityEvent);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0025  */
        /* JADX WARN: Code duplicated, block: B:15:0x002f  */
        /* JADX WARN: Code duplicated, block: B:17:0x003b  */
        /* JADX WARN: Code duplicated, block: B:19:0x0041 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0042  */
        /* JADX WARN: Code duplicated, block: B:22:0x004a  */
        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: g */
        public final boolean mo3000g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            boolean z10;
            RecyclerView recyclerView;
            C10026a c10026a;
            C1149e0 c1149e0 = this.f7252d;
            RecyclerView recyclerView2 = c1149e0.f7250d;
            if (recyclerView2.f6989Q && !recyclerView2.f7007c0) {
                if (!recyclerView2.f7010e.m4417g()) {
                    z10 = false;
                }
                if (!z10) {
                    recyclerView = c1149e0.f7250d;
                    if (recyclerView.getLayoutManager() != null) {
                        c10026a = (C10026a) this.f7253e.get(view);
                        if (c10026a != null) {
                            if (c10026a.mo3000g(view, i10, bundle)) {
                                return true;
                            }
                        } else if (super.mo3000g(view, i10, bundle)) {
                            return true;
                        }
                        RecyclerView.C1127t c1127t = recyclerView.getLayoutManager().f7085b.f7006c;
                        return false;
                    }
                }
                return super.mo3000g(view, i10, bundle);
            }
            z10 = true;
            if (!z10) {
                recyclerView = c1149e0.f7250d;
                if (recyclerView.getLayoutManager() != null) {
                    c10026a = (C10026a) this.f7253e.get(view);
                    if (c10026a != null) {
                        if (c10026a.mo3000g(view, i10, bundle)) {
                            return true;
                        }
                    } else if (super.mo3000g(view, i10, bundle)) {
                        return true;
                    }
                    RecyclerView.C1127t c1127t2 = recyclerView.getLayoutManager().f7085b.f7006c;
                    return false;
                }
            }
            return super.mo3000g(view, i10, bundle);
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: h */
        public final void mo4453h(View view, int i10) {
            C10026a c10026a = (C10026a) this.f7253e.get(view);
            if (c10026a != null) {
                c10026a.mo4453h(view, i10);
            } else {
                super.mo4453h(view, i10);
            }
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: i */
        public final void mo4454i(View view, AccessibilityEvent accessibilityEvent) {
            C10026a c10026a = (C10026a) this.f7253e.get(view);
            if (c10026a != null) {
                c10026a.mo4454i(view, accessibilityEvent);
            } else {
                super.mo4454i(view, accessibilityEvent);
            }
        }
    }

    public C1149e0(RecyclerView recyclerView) {
        this.f7250d = recyclerView;
        a aVar = this.f7251e;
        if (aVar != null) {
            this.f7251e = aVar;
        } else {
            this.f7251e = new a(this);
        }
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: c */
    public final void mo2998c(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.mo2998c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f7250d;
            if (!(!recyclerView.f6989Q || recyclerView.f7007c0 || recyclerView.f7010e.m4417g())) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().mo4127X(accessibilityEvent);
                }
            }
        }
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: d */
    public final void mo2999d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C10284f c10284f) {
        this.f50989a.onInitializeAccessibilityNodeInfo(view, c10284f.f51739a);
        RecyclerView recyclerView = this.f7250d;
        if (!(!recyclerView.f6989Q || recyclerView.f7007c0 || recyclerView.f7010e.m4417g()) && recyclerView.getLayoutManager() != null) {
            RecyclerView.AbstractC1120m layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f7085b;
            layoutManager.mo4076Y(recyclerView2.f7006c, recyclerView2.f6967D0, c10284f);
        }
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: g */
    public final boolean mo3000g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        boolean z10 = true;
        if (super.mo3000g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7250d;
        if (recyclerView.f6989Q && !recyclerView.f7007c0 && !recyclerView.f7010e.m4417g()) {
            z10 = false;
        }
        if (z10 || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.AbstractC1120m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7085b;
        return layoutManager.mo4314l0(recyclerView2.f7006c, recyclerView2.f6967D0, i10, bundle);
    }
}
