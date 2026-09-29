package p474x5;

import ae.C0062b;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p356r5.C8735e;
import p356r5.InterfaceC8732b;
import p446w2.InterfaceC9806d;

/* JADX INFO: renamed from: x5.r */
/* JADX INFO: loaded from: classes.dex */
public final class C10093r<Model, Data> implements InterfaceC10090o<Model, Data> {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC10090o<Model, Data>> f51186a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9806d<List<Throwable>> f51187b;

    /* JADX INFO: renamed from: x5.r$a */
    public static class a<Data> implements InterfaceC2097d<Data>, InterfaceC2097d.a<Data> {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC2097d<Data>> f51188a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC9806d<List<Throwable>> f51189b;

        /* JADX INFO: renamed from: c */
        public int f51190c;

        /* JADX INFO: renamed from: d */
        public Priority f51191d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2097d.a<? super Data> f51192e;

        /* JADX INFO: renamed from: f */
        public List<Throwable> f51193f;

        /* JADX INFO: renamed from: g */
        public boolean f51194g;

        public a(ArrayList arrayList, InterfaceC9806d interfaceC9806d) {
            this.f51189b = interfaceC9806d;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f51188a = arrayList;
            this.f51190c = 0;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: a */
        public final Class<Data> mo6269a() {
            return this.f51188a.get(0).mo6269a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: b */
        public final void mo6272b() {
            List<Throwable> list = this.f51193f;
            if (list != null) {
                this.f51189b.mo11464a(list);
            }
            this.f51193f = null;
            Iterator<InterfaceC2097d<Data>> it = this.f51188a.iterator();
            while (it.hasNext()) {
                it.next().mo6272b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d.a
        /* JADX INFO: renamed from: c */
        public final void mo6277c(Exception exc) {
            List<Throwable> list = this.f51193f;
            C0062b.m345f0(list);
            list.add(exc);
            m18939g();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        public final void cancel() {
            this.f51194g = true;
            Iterator<InterfaceC2097d<Data>> it = this.f51188a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: d */
        public final DataSource mo6274d() {
            return this.f51188a.get(0).mo6274d();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: e */
        public final void mo6275e(Priority priority, InterfaceC2097d.a<? super Data> aVar) {
            this.f51191d = priority;
            this.f51192e = aVar;
            this.f51193f = this.f51189b.mo11465b();
            this.f51188a.get(this.f51190c).mo6275e(priority, this);
            if (this.f51194g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d.a
        /* JADX INFO: renamed from: f */
        public final void mo6278f(Data data) {
            if (data != null) {
                this.f51192e.mo6278f(data);
            } else {
                m18939g();
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m18939g() {
            if (this.f51194g) {
                return;
            }
            if (this.f51190c < this.f51188a.size() - 1) {
                this.f51190c++;
                mo6275e(this.f51191d, this.f51192e);
            } else {
                C0062b.m345f0(this.f51193f);
                this.f51192e.mo6277c(new GlideException(new ArrayList(this.f51193f), "Fetch failed"));
            }
        }
    }

    public C10093r(ArrayList arrayList, InterfaceC9806d interfaceC9806d) {
        this.f51186a = arrayList;
        this.f51187b = interfaceC9806d;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Model model) {
        Iterator<InterfaceC10090o<Model, Data>> it = this.f51186a.iterator();
        while (it.hasNext()) {
            if (it.next().mo18919a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a<Data> mo18920b(Model model, int i10, int i11, C8735e c8735e) {
        InterfaceC10090o.a<Data> aVarMo18920b;
        List<InterfaceC10090o<Model, Data>> list = this.f51186a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC10090o.a<Data> aVar = null;
        InterfaceC8732b interfaceC8732b = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC10090o<Model, Data> interfaceC10090o = list.get(i12);
            if (interfaceC10090o.mo18919a(model) && (aVarMo18920b = interfaceC10090o.mo18920b(model, i10, i11, c8735e)) != null) {
                arrayList.add(aVarMo18920b.f51181c);
                interfaceC8732b = aVarMo18920b.f51179a;
            }
        }
        if (!arrayList.isEmpty() && interfaceC8732b != null) {
            aVar = new InterfaceC10090o.a<>(interfaceC8732b, new a(arrayList, this.f51187b));
        }
        return aVar;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f51186a.toArray()) + '}';
    }
}
