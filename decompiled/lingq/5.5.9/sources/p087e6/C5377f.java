package p087e6;

import ae.C0062b;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C2085g;
import com.bumptech.glide.C2089k;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.bumptech.glide.ComponentCallbacks2C2090l;
import java.util.ArrayList;
import p171i6.C6202g;
import p192j6.AbstractC6414c;
import p236l6.C7283d;
import p258m6.C7485e;
import p258m6.C7492l;
import p332q5.C8498e;
import p332q5.InterfaceC8494a;
import p356r5.InterfaceC8738h;
import p392t5.AbstractC9200f;
import p407u5.InterfaceC9452c;
import p525z5.C10444c;

/* JADX INFO: renamed from: e6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5377f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8494a f33769a;

    /* JADX INFO: renamed from: b */
    public final Handler f33770b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f33771c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C2090l f33772d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9452c f33773e;

    /* JADX INFO: renamed from: f */
    public boolean f33774f;

    /* JADX INFO: renamed from: g */
    public boolean f33775g;

    /* JADX INFO: renamed from: h */
    public C2089k<Bitmap> f33776h;

    /* JADX INFO: renamed from: i */
    public a f33777i;

    /* JADX INFO: renamed from: j */
    public boolean f33778j;

    /* JADX INFO: renamed from: k */
    public a f33779k;

    /* JADX INFO: renamed from: l */
    public Bitmap f33780l;

    /* JADX INFO: renamed from: m */
    public InterfaceC8738h<Bitmap> f33781m;

    /* JADX INFO: renamed from: n */
    public a f33782n;

    /* JADX INFO: renamed from: o */
    public int f33783o;

    /* JADX INFO: renamed from: p */
    public int f33784p;

    /* JADX INFO: renamed from: q */
    public int f33785q;

    /* JADX INFO: renamed from: e6.f$a */
    public static class a extends AbstractC6414c<Bitmap> {

        /* JADX INFO: renamed from: d */
        public final Handler f33786d;

        /* JADX INFO: renamed from: e */
        public final int f33787e;

        /* JADX INFO: renamed from: f */
        public final long f33788f;

        /* JADX INFO: renamed from: g */
        public Bitmap f33789g;

        public a(Handler handler, int i10, long j10) {
            this.f33786d = handler;
            this.f33787e = i10;
            this.f33788f = j10;
        }

        @Override // p192j6.InterfaceC6419h
        /* JADX INFO: renamed from: e */
        public final void mo6262e(Object obj) {
            this.f33789g = (Bitmap) obj;
            Handler handler = this.f33786d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f33788f);
        }

        @Override // p192j6.InterfaceC6419h
        /* JADX INFO: renamed from: l */
        public final void mo11551l(Drawable drawable) {
            this.f33789g = null;
        }
    }

    /* JADX INFO: renamed from: e6.f$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo11546a();
    }

    /* JADX INFO: renamed from: e6.f$c */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            C5377f c5377f = C5377f.this;
            if (i10 == 1) {
                c5377f.m11549b((a) message.obj);
                return true;
            }
            if (i10 == 2) {
                c5377f.f33772d.m6256f((a) message.obj);
            }
            return false;
        }
    }

    public C5377f(ComponentCallbacks2C2080b componentCallbacks2C2080b, C8498e c8498e, int i10, int i11, C10444c c10444c, Bitmap bitmap) {
        InterfaceC9452c interfaceC9452c = componentCallbacks2C2080b.f10550a;
        C2085g c2085g = componentCallbacks2C2080b.f10552c;
        ComponentCallbacks2C2090l componentCallbacks2C2090lM6238e = ComponentCallbacks2C2080b.m6238e(c2085g.getBaseContext());
        C2089k<Bitmap> c2089kM6242A = ComponentCallbacks2C2080b.m6238e(c2085g.getBaseContext()).m6254c().m6242A(((C6202g) ((C6202g) new C6202g().m12718f(AbstractC9200f.f47748a).m12734y()).m12729t()).m12721j(i10, i11));
        this.f33771c = new ArrayList();
        this.f33772d = componentCallbacks2C2090lM6238e;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f33773e = interfaceC9452c;
        this.f33770b = handler;
        this.f33776h = c2089kM6242A;
        this.f33769a = c8498e;
        m11550c(c10444c, bitmap);
    }

    /* JADX INFO: renamed from: a */
    public final void m11548a() {
        if (this.f33774f) {
            if (this.f33775g) {
                return;
            }
            a aVar = this.f33782n;
            if (aVar != null) {
                this.f33782n = null;
                m11549b(aVar);
                return;
            }
            this.f33775g = true;
            InterfaceC8494a interfaceC8494a = this.f33769a;
            long jUptimeMillis = SystemClock.uptimeMillis() + ((long) interfaceC8494a.mo16585e());
            interfaceC8494a.mo16583c();
            this.f33779k = new a(this.f33770b, interfaceC8494a.mo16586f(), jUptimeMillis);
            C2089k<Bitmap> c2089kM6247G = this.f33776h.m6242A(new C6202g().m12728s(new C7283d(Double.valueOf(Math.random())))).m6247G(interfaceC8494a);
            c2089kM6247G.m6246F(this.f33779k, null, c2089kM6247G, C7485e.f41368a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11549b(a aVar) {
        this.f33775g = false;
        boolean z10 = this.f33778j;
        Handler handler = this.f33770b;
        if (z10) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f33774f) {
            this.f33782n = aVar;
            return;
        }
        if (aVar.f33789g != null) {
            Bitmap bitmap = this.f33780l;
            if (bitmap != null) {
                this.f33773e.mo164d(bitmap);
                this.f33780l = null;
            }
            a aVar2 = this.f33777i;
            this.f33777i = aVar;
            ArrayList arrayList = this.f33771c;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((b) arrayList.get(size)).mo11546a();
                }
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m11548a();
    }

    /* JADX INFO: renamed from: c */
    public final void m11550c(InterfaceC8738h<Bitmap> interfaceC8738h, Bitmap bitmap) {
        C0062b.m345f0(interfaceC8738h);
        this.f33781m = interfaceC8738h;
        C0062b.m345f0(bitmap);
        this.f33780l = bitmap;
        this.f33776h = this.f33776h.m6242A(new C6202g().m12733x(interfaceC8738h, true));
        this.f33783o = C7492l.m14882c(bitmap);
        this.f33784p = bitmap.getWidth();
        this.f33785q = bitmap.getHeight();
    }
}
