package p474x5;

import ae.C0062b;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.util.Collections;
import java.util.List;
import p356r5.C8735e;
import p356r5.InterfaceC8732b;

/* JADX INFO: renamed from: x5.o */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC10090o<Model, Data> {

    /* JADX INFO: renamed from: x5.o$a */
    public static class a<Data> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8732b f51179a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC8732b> f51180b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC2097d<Data> f51181c;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a() {
            throw null;
        }

        public a(InterfaceC8732b interfaceC8732b, InterfaceC2097d<Data> interfaceC2097d) {
            List<InterfaceC8732b> listEmptyList = Collections.emptyList();
            C0062b.m345f0(interfaceC8732b);
            this.f51179a = interfaceC8732b;
            C0062b.m345f0(listEmptyList);
            this.f51180b = listEmptyList;
            C0062b.m345f0(interfaceC2097d);
            this.f51181c = interfaceC2097d;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo18919a(Model model);

    /* JADX INFO: renamed from: b */
    a<Data> mo18920b(Model model, int i10, int i11, C8735e c8735e);
}
