package p164i;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p471x2.C10049l0;
import p471x2.C10053n0;
import p471x2.InterfaceC10051m0;

/* JADX INFO: renamed from: i.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6106g {

    /* JADX INFO: renamed from: c */
    public Interpolator f35912c;

    /* JADX INFO: renamed from: d */
    public InterfaceC10051m0 f35913d;

    /* JADX INFO: renamed from: e */
    public boolean f35914e;

    /* JADX INFO: renamed from: b */
    public long f35911b = -1;

    /* JADX INFO: renamed from: f */
    public final a f35915f = new a();

    /* JADX INFO: renamed from: a */
    public final ArrayList<C10049l0> f35910a = new ArrayList<>();

    /* JADX INFO: renamed from: i.g$a */
    public class a extends C10053n0 {

        /* JADX INFO: renamed from: a */
        public boolean f35916a = false;

        /* JADX INFO: renamed from: b */
        public int f35917b = 0;

        public a() {
        }

        @Override // p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: a */
        public final void mo1078a() {
            int i10 = this.f35917b + 1;
            this.f35917b = i10;
            C6106g c6106g = C6106g.this;
            if (i10 == c6106g.f35910a.size()) {
                InterfaceC10051m0 interfaceC10051m0 = c6106g.f35913d;
                if (interfaceC10051m0 != null) {
                    interfaceC10051m0.mo1078a();
                }
                this.f35917b = 0;
                this.f35916a = false;
                c6106g.f35914e = false;
            }
        }

        @Override // p471x2.C10053n0, p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: c */
        public final void mo1080c() {
            if (this.f35916a) {
                return;
            }
            this.f35916a = true;
            InterfaceC10051m0 interfaceC10051m0 = C6106g.this.f35913d;
            if (interfaceC10051m0 != null) {
                interfaceC10051m0.mo1080c();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12607a() {
        if (this.f35914e) {
            Iterator<C10049l0> it = this.f35910a.iterator();
            while (it.hasNext()) {
                it.next().m18836b();
            }
            this.f35914e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12608b() {
        View view;
        if (this.f35914e) {
            return;
        }
        for (C10049l0 c10049l0 : this.f35910a) {
            long j10 = this.f35911b;
            if (j10 >= 0) {
                c10049l0.m18837c(j10);
            }
            Interpolator interpolator = this.f35912c;
            if (interpolator != null && (view = c10049l0.f51041a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f35913d != null) {
                c10049l0.m18838d(this.f35915f);
            }
            View view2 = c10049l0.f51041a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f35914e = true;
    }
}
