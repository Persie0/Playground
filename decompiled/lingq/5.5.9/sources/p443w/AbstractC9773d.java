package p443w;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import p284o0.InterfaceC7885a;

/* JADX INFO: renamed from: w.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9773d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f49853a = 0;

    /* JADX INFO: renamed from: w.d$a */
    public static final class a extends AbstractC9773d {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int f49854b = 0;

        static {
            new a();
        }

        @Override // p443w.AbstractC9773d
        /* JADX INFO: renamed from: a */
        public final int mo18271a(int i10, LayoutDirection layoutDirection, AbstractC0526g abstractC0526g) {
            C5207g.m11111f(layoutDirection, "layoutDirection");
            return i10 / 2;
        }
    }

    /* JADX INFO: renamed from: w.d$b */
    public static final class b extends AbstractC9773d {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int f49855b = 0;

        static {
            new b();
        }

        @Override // p443w.AbstractC9773d
        /* JADX INFO: renamed from: a */
        public final int mo18271a(int i10, LayoutDirection layoutDirection, AbstractC0526g abstractC0526g) {
            C5207g.m11111f(layoutDirection, "layoutDirection");
            if (layoutDirection == LayoutDirection.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: w.d$c */
    public static final class c extends AbstractC9773d {

        /* JADX INFO: renamed from: b */
        public final InterfaceC7885a.b f49856b;

        public c(InterfaceC7885a.b bVar) {
            C5207g.m11111f(bVar, "horizontal");
            this.f49856b = bVar;
        }

        @Override // p443w.AbstractC9773d
        /* JADX INFO: renamed from: a */
        public final int mo18271a(int i10, LayoutDirection layoutDirection, AbstractC0526g abstractC0526g) {
            C5207g.m11111f(layoutDirection, "layoutDirection");
            return this.f49856b.mo15656a(i10, layoutDirection);
        }
    }

    /* JADX INFO: renamed from: w.d$d */
    public static final class d extends AbstractC9773d {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int f49857b = 0;

        static {
            new d();
        }

        @Override // p443w.AbstractC9773d
        /* JADX INFO: renamed from: a */
        public final int mo18271a(int i10, LayoutDirection layoutDirection, AbstractC0526g abstractC0526g) {
            C5207g.m11111f(layoutDirection, "layoutDirection");
            if (layoutDirection == LayoutDirection.Ltr) {
                i10 = 0;
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: w.d$e */
    public static final class e extends AbstractC9773d {

        /* JADX INFO: renamed from: b */
        public final InterfaceC7885a.c f49858b;

        public e(InterfaceC7885a.c cVar) {
            C5207g.m11111f(cVar, "vertical");
            this.f49858b = cVar;
        }

        @Override // p443w.AbstractC9773d
        /* JADX INFO: renamed from: a */
        public final int mo18271a(int i10, LayoutDirection layoutDirection, AbstractC0526g abstractC0526g) {
            C5207g.m11111f(layoutDirection, "layoutDirection");
            return this.f49858b.mo15657a(i10);
        }
    }

    static {
        int i10 = a.f49854b;
        int i11 = d.f49857b;
        int i12 = b.f49855b;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo18271a(int i10, LayoutDirection layoutDirection, AbstractC0526g abstractC0526g);
}
