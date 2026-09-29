package androidx.compose.p002ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import p000.C3386nv;
import p000.aq4;
import p000.ci8;
import p000.fa4;
import p000.fg7;
import p000.kg7;
import p000.pg7;
import p000.vi3;
import p000.x44;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0329c {

    /* JADX INFO: renamed from: a */
    public aq4 f4127a;

    /* JADX INFO: renamed from: b */
    public PointerInteropFilter$DispatchToViewState f4128b = PointerInteropFilter$DispatchToViewState.Unknown;

    /* JADX INFO: renamed from: c */
    public fg7 f4129c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pg7 f4130d;

    public C0329c(pg7 pg7Var) {
        this.f4130d = pg7Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m1463a(fg7 fg7Var, boolean z) {
        List list = fg7Var.f39071a;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (((kg7) list.get(i)).m15191c()) {
                m1466d(fg7Var);
                return;
            }
        }
        aq4 aq4Var = this.f4127a;
        if (aq4Var == null) {
            C3386nv.m17633t("layoutCoordinates not set");
            return;
        }
        long jMo1671R = aq4Var.mo1671R(0L);
        final pg7 pg7Var = this.f4130d;
        AbstractC0331e.m1470c(fg7Var, jMo1671R, new vi3() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                pg7 pg7Var2 = pg7Var;
                if (actionMasked == 0) {
                    vi3 vi3Var = pg7Var2.f56185a;
                    if (vi3Var == null) {
                        fa4.m11636J("onTouchEvent");
                        throw null;
                    }
                    this.f4098b.f4128b = ((Boolean) ((PointerInteropFilter_androidKt$pointerInteropFilter$3) vi3Var).invoke(motionEvent)).booleanValue() ? PointerInteropFilter$DispatchToViewState.Dispatching : PointerInteropFilter$DispatchToViewState.NotDispatching;
                } else {
                    vi3 vi3Var2 = pg7Var2.f56185a;
                    if (vi3Var2 == null) {
                        fa4.m11636J("onTouchEvent");
                        throw null;
                    }
                    ((PointerInteropFilter_androidKt$pointerInteropFilter$3) vi3Var2).invoke(motionEvent);
                }
                return xfa.f68157a;
            }
        });
        if (this.f4128b == PointerInteropFilter$DispatchToViewState.Dispatching) {
            if (z) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((kg7) list.get(i2)).m15189a();
                }
            }
            x44 x44Var = fg7Var.f39072b;
            if (x44Var != null) {
                x44Var.f67751b = !pg7Var.f56187c;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1464b() {
        if (this.f4128b == PointerInteropFilter$DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            pg7 pg7Var = this.f4130d;
            AbstractC0331e.m1468a(jUptimeMillis, new PointerInteropFilter$pointerInputFilter$1$onCancel$1(pg7Var));
            this.f4128b = PointerInteropFilter$DispatchToViewState.Unknown;
            pg7Var.f56187c = false;
            this.f4129c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1465c(fg7 fg7Var, PointerEventPass pointerEventPass) {
        boolean z;
        boolean z2;
        boolean z3;
        List list = fg7Var.f39071a;
        List list2 = list;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            kg7 kg7Var = (kg7) list.get(i);
            if (ci8.m4723h(kg7Var) || ci8.m4725j(kg7Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((kg7) list.get(i2)).m15191c()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        pg7 pg7Var = this.f4130d;
        if (pg7Var.f56187c) {
            z3 = true;
            break;
        }
        int size3 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                kg7 kg7Var2 = (kg7) list.get(i3);
                if (!ci8.m4723h(kg7Var2) && !ci8.m4725j(kg7Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        if (this.f4128b != PointerInteropFilter$DispatchToViewState.NotDispatching) {
            if (pointerEventPass == PointerEventPass.Initial && z3) {
                this.f4129c = fg7Var;
                m1463a(fg7Var, !z || pg7Var.f56187c);
            }
            if (pointerEventPass == PointerEventPass.Main && z && fg7Var == this.f4129c && pg7Var.f56187c) {
                int size4 = list2.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((kg7) list.get(i4)).m15189a();
                }
            }
            if (pointerEventPass == PointerEventPass.Final && !z3 && fg7Var != this.f4129c) {
                m1463a(fg7Var, true);
            }
        }
        if (pointerEventPass == PointerEventPass.Final) {
            int size5 = list2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    this.f4128b = PointerInteropFilter$DispatchToViewState.Unknown;
                    pg7Var.f56187c = false;
                    this.f4129c = null;
                    break;
                } else if (!ci8.m4725j((kg7) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (fg7Var == this.f4129c && z) {
                int size6 = list2.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((kg7) list.get(i6)).m15191c()) {
                        if (pg7Var.f56187c) {
                            break;
                        }
                        m1466d(fg7Var);
                        return;
                    }
                }
                int size7 = list2.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((kg7) list.get(i7)).m15189a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1466d(fg7 fg7Var) {
        if (this.f4128b == PointerInteropFilter$DispatchToViewState.Dispatching) {
            aq4 aq4Var = this.f4127a;
            if (aq4Var == null) {
                C3386nv.m17633t("layoutCoordinates not set");
                return;
            } else {
                long jMo1671R = aq4Var.mo1671R(0L);
                final pg7 pg7Var = this.f4130d;
                AbstractC0331e.m1469b(fg7Var, jMo1671R, new vi3() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$stopDispatching$1
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        MotionEvent motionEvent = (MotionEvent) obj;
                        vi3 vi3Var = pg7Var.f56185a;
                        if (vi3Var != null) {
                            ((PointerInteropFilter_androidKt$pointerInteropFilter$3) vi3Var).invoke(motionEvent);
                            return xfa.f68157a;
                        }
                        fa4.m11636J("onTouchEvent");
                        throw null;
                    }
                });
            }
        }
        this.f4128b = PointerInteropFilter$DispatchToViewState.NotDispatching;
    }
}
