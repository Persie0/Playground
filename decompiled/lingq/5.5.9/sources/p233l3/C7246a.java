package p233l3;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p326q.C8452h;

/* JADX INFO: renamed from: l3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7246a {

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal<C7246a> f40689f = new ThreadLocal<>();

    /* JADX INFO: renamed from: d */
    public d f40693d;

    /* JADX INFO: renamed from: a */
    public final C8452h<b, Long> f40690a = new C8452h<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<b> f40691b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final a f40692c = new a();

    /* JADX INFO: renamed from: e */
    public boolean f40694e = false;

    /* JADX INFO: renamed from: l3.a$a */
    public class a {
        public a() {
        }
    }

    /* JADX INFO: renamed from: l3.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo14590a(long j10);
    }

    /* JADX INFO: renamed from: l3.a$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final a f40696a;

        public c(a aVar) {
            this.f40696a = aVar;
        }
    }

    /* JADX INFO: renamed from: l3.a$d */
    public static class d extends c {

        /* JADX INFO: renamed from: b */
        public final Choreographer f40697b;

        /* JADX INFO: renamed from: c */
        public final a f40698c;

        /* JADX INFO: renamed from: l3.a$d$a */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            /* JADX WARN: Code duplicated, block: B:17:0x004e  */
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                ArrayList<b> arrayList;
                boolean z10;
                a aVar = d.this.f40696a;
                aVar.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                C7246a c7246a = C7246a.this;
                c7246a.getClass();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (true) {
                    arrayList = c7246a.f40691b;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    b bVar = arrayList.get(i10);
                    if (bVar != null) {
                        C8452h<b, Long> c8452h = c7246a.f40690a;
                        Long orDefault = c8452h.getOrDefault(bVar, null);
                        if (orDefault != null) {
                            if (orDefault.longValue() < jUptimeMillis2) {
                                c8452h.remove(bVar);
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                bVar.mo14590a(jUptimeMillis);
                            }
                        }
                        z10 = true;
                        if (z10) {
                            bVar.mo14590a(jUptimeMillis);
                        }
                    }
                    i10++;
                }
                if (c7246a.f40694e) {
                    int size = arrayList.size();
                    loop1: while (true) {
                        while (true) {
                            size--;
                            if (size < 0) {
                                break loop1;
                            } else if (arrayList.get(size) == null) {
                                arrayList.remove(size);
                            }
                        }
                    }
                    c7246a.f40694e = false;
                }
                if (arrayList.size() > 0) {
                    if (c7246a.f40693d == null) {
                        c7246a.f40693d = new d(c7246a.f40692c);
                    }
                    d dVar = c7246a.f40693d;
                    dVar.f40697b.postFrameCallback(dVar.f40698c);
                }
            }
        }

        public d(a aVar) {
            super(aVar);
            this.f40697b = Choreographer.getInstance();
            this.f40698c = new a();
        }
    }
}
