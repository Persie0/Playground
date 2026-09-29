package p000;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: yy */
/* JADX INFO: loaded from: classes2.dex */
public final class C3813yy {

    /* JADX INFO: renamed from: a */
    public final ImmutableList f70626a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f70627b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f70628c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public boolean f70629d;

    public C3813yy(ImmutableList immutableList) {
        this.f70626a = immutableList;
        C3850zy c3850zy = C3850zy.f72365e;
        this.f70629d = false;
    }

    /* JADX INFO: renamed from: a */
    public final C3850zy m25372a(C3850zy c3850zy) {
        if (c3850zy.equals(C3850zy.f72365e)) {
            throw new AudioProcessor$UnhandledAudioFormatException(c3850zy);
        }
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.f70626a;
            if (i >= immutableList.size()) {
                return c3850zy;
            }
            InterfaceC0828bz interfaceC0828bz = (InterfaceC0828bz) immutableList.get(i);
            C3850zy c3850zyMo4232g = interfaceC0828bz.mo4232g(c3850zy);
            if (interfaceC0828bz.mo4227b()) {
                bna.m3987z(!c3850zyMo4232g.equals(C3850zy.f72365e));
                c3850zy = c3850zyMo4232g;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25373b() {
        C0791az c0791az = C0791az.f7677b;
        ArrayList arrayList = this.f70627b;
        arrayList.clear();
        this.f70629d = false;
        long jMo4234i = c0791az.f7678a;
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.f70626a;
            if (i >= immutableList.size()) {
                break;
            }
            InterfaceC0828bz interfaceC0828bz = (InterfaceC0828bz) immutableList.get(i);
            interfaceC0828bz.mo4230e(new C0791az(jMo4234i));
            if (interfaceC0828bz.mo4227b()) {
                jMo4234i = interfaceC0828bz.mo4234i(jMo4234i);
                bna.m3987z(jMo4234i >= 0);
                arrayList.add(interfaceC0828bz);
            }
            i++;
        }
        this.f70628c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m25374c(); i2++) {
            this.f70628c[i2] = ((InterfaceC0828bz) arrayList.get(i2)).mo4229d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m25374c() {
        return this.f70628c.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public final ByteBuffer m25375d() {
        if (!m25377f()) {
            return InterfaceC0828bz.f9188a;
        }
        ByteBuffer byteBuffer = this.f70628c[m25374c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m25378g(InterfaceC0828bz.f9188a);
        return this.f70628c[m25374c()];
    }

    /* JADX INFO: renamed from: e */
    public final boolean m25376e() {
        return this.f70629d && ((InterfaceC0828bz) this.f70627b.get(m25374c())).mo4228c() && !this.f70628c[m25374c()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3813yy)) {
            return false;
        }
        ImmutableList immutableList = ((C3813yy) obj).f70626a;
        ImmutableList immutableList2 = this.f70626a;
        if (immutableList2.size() != immutableList.size()) {
            return false;
        }
        for (int i = 0; i < immutableList2.size(); i++) {
            if (immutableList2.get(i) != immutableList.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25377f() {
        return !this.f70627b.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public final void m25378g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= m25374c(); i++) {
                if (!this.f70628c[i].hasRemaining()) {
                    ArrayList arrayList = this.f70627b;
                    InterfaceC0828bz interfaceC0828bz = (InterfaceC0828bz) arrayList.get(i);
                    if (!interfaceC0828bz.mo4228c()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f70628c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC0828bz.f9188a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC0828bz.mo4231f(byteBuffer2);
                        this.f70628c[i] = interfaceC0828bz.mo4229d();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f70628c[i].hasRemaining();
                    } else if (!this.f70628c[i].hasRemaining() && i < m25374c()) {
                        ((InterfaceC0828bz) arrayList.get(i + 1)).mo4233h();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m25379h() {
        if (!m25377f() || this.f70629d) {
            return;
        }
        this.f70629d = true;
        ((InterfaceC0828bz) this.f70627b.get(0)).mo4233h();
    }

    public final int hashCode() {
        return this.f70626a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m25380i(ByteBuffer byteBuffer) {
        if (!m25377f() || this.f70629d) {
            return;
        }
        m25378g(byteBuffer);
    }

    /* JADX INFO: renamed from: j */
    public final void m25381j() {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.f70626a;
            if (i >= immutableList.size()) {
                this.f70627b.clear();
                this.f70628c = new ByteBuffer[0];
                C3850zy c3850zy = C3850zy.f72365e;
                this.f70629d = false;
                return;
            }
            InterfaceC0828bz interfaceC0828bz = (InterfaceC0828bz) immutableList.get(i);
            interfaceC0828bz.mo4230e(C0791az.f7677b);
            interfaceC0828bz.reset();
            i++;
        }
    }
}
