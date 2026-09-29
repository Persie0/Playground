package androidx.compose.p017ui.text.font;

import dm.C5207g;
import p081e0.InterfaceC5301c1;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.i */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0703i extends InterfaceC5301c1<Object> {

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.i$a */
    public static final class a implements InterfaceC0703i, InterfaceC5301c1<Object> {

        /* JADX INFO: renamed from: a */
        public final AsyncFontListLoader f4642a;

        public a(AsyncFontListLoader asyncFontListLoader) {
            this.f4642a = asyncFontListLoader;
        }

        @Override // androidx.compose.p017ui.text.font.InterfaceC0703i
        /* JADX INFO: renamed from: b */
        public final boolean mo2601b() {
            return this.f4642a.f4589g;
        }

        @Override // p081e0.InterfaceC5301c1
        public final Object getValue() {
            return this.f4642a.getValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.i$b */
    public static final class b implements InterfaceC0703i {

        /* JADX INFO: renamed from: a */
        public final Object f4643a;

        /* JADX INFO: renamed from: b */
        public final boolean f4644b;

        public b(Object obj, boolean z10) {
            C5207g.m11111f(obj, "value");
            this.f4643a = obj;
            this.f4644b = z10;
        }

        @Override // androidx.compose.p017ui.text.font.InterfaceC0703i
        /* JADX INFO: renamed from: b */
        public final boolean mo2601b() {
            return this.f4644b;
        }

        @Override // p081e0.InterfaceC5301c1
        public final Object getValue() {
            return this.f4643a;
        }
    }

    /* JADX INFO: renamed from: b */
    boolean mo2601b();
}
