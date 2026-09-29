package p482xd;

import com.google.common.base.AbstractIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: xd.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10176h {

    /* JADX INFO: renamed from: a */
    public final AbstractC10169a f51489a;

    /* JADX INFO: renamed from: b */
    public final b f51490b;

    /* JADX INFO: renamed from: c */
    public final int f51491c;

    /* JADX INFO: renamed from: xd.h$a */
    public static abstract class a extends AbstractIterator<String> {

        /* JADX INFO: renamed from: c */
        public final CharSequence f51492c;

        /* JADX INFO: renamed from: d */
        public final AbstractC10169a f51493d;

        /* JADX INFO: renamed from: g */
        public int f51496g;

        /* JADX INFO: renamed from: f */
        public int f51495f = 0;

        /* JADX INFO: renamed from: e */
        public final boolean f51494e = false;

        public a(C10176h c10176h, CharSequence charSequence) {
            this.f51493d = c10176h.f51489a;
            this.f51496g = c10176h.f51491c;
            this.f51492c = charSequence;
        }
    }

    /* JADX INFO: renamed from: xd.h$b */
    public interface b {
    }

    public C10176h(C10175g c10175g) {
        AbstractC10169a.d dVar = AbstractC10169a.d.f51474b;
        this.f51490b = c10175g;
        this.f51489a = dVar;
        this.f51491c = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m19191a(CharSequence charSequence) {
        charSequence.getClass();
        C10175g c10175g = (C10175g) this.f51490b;
        c10175g.getClass();
        C10174f c10174f = new C10174f(c10175g, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c10174f.hasNext()) {
            arrayList.add(c10174f.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
