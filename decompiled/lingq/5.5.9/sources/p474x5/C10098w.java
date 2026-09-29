package p474x5;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import p236l6.C7283d;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.w */
/* JADX INFO: loaded from: classes.dex */
public final class C10098w<Model> implements InterfaceC10090o<Model, Model> {

    /* JADX INFO: renamed from: a */
    public static final C10098w<?> f51214a = new C10098w<>();

    /* JADX INFO: renamed from: x5.w$a */
    public static class a<Model> implements InterfaceC10091p<Model, Model> {

        /* JADX INFO: renamed from: a */
        public static final a<?> f51215a = new a<>();

        @Deprecated
        public a() {
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Model, Model> mo18922c(C10094s c10094s) {
            return C10098w.f51214a;
        }
    }

    /* JADX INFO: renamed from: x5.w$b */
    public static class b<Model> implements InterfaceC2097d<Model> {

        /* JADX INFO: renamed from: a */
        public final Model f51216a;

        public b(Model model) {
            this.f51216a = model;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: a */
        public final Class<Model> mo6269a() {
            return (Class<Model>) this.f51216a.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: b */
        public final void mo6272b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: d */
        public final DataSource mo6274d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: e */
        public final void mo6275e(Priority priority, InterfaceC2097d.a<? super Model> aVar) {
            aVar.mo6278f(this.f51216a);
        }
    }

    @Deprecated
    public C10098w() {
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Model model) {
        return true;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a<Model> mo18920b(Model model, int i10, int i11, C8735e c8735e) {
        return new InterfaceC10090o.a<>(new C7283d(model), new b(model));
    }
}
