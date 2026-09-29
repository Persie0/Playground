package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzah;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ylb implements gp6 {

    /* JADX INFO: renamed from: f */
    public static final Charset f70036f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final c33 f70037g;

    /* JADX INFO: renamed from: h */
    public static final c33 f70038h;

    /* JADX INFO: renamed from: i */
    public static final rlb f70039i;

    /* JADX INFO: renamed from: a */
    public OutputStream f70040a;

    /* JADX INFO: renamed from: b */
    public final HashMap f70041b;

    /* JADX INFO: renamed from: c */
    public final HashMap f70042c;

    /* JADX INFO: renamed from: d */
    public final fp6 f70043d;

    /* JADX INFO: renamed from: e */
    public final lmb f70044e = new lmb(this, 0);

    static {
        zzah zzahVar = zzah.DEFAULT;
        lhb lhbVar = new lhb(1, zzahVar);
        HashMap map = new HashMap();
        map.put(wkb.class, lhbVar);
        f70037g = new c33("key", AbstractC3393o1.m17744s(map));
        lhb lhbVar2 = new lhb(2, zzahVar);
        HashMap map2 = new HashMap();
        map2.put(wkb.class, lhbVar2);
        f70038h = new c33("value", AbstractC3393o1.m17744s(map2));
        f70039i = rlb.f59509b;
    }

    public ylb(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, fp6 fp6Var) {
        this.f70040a = byteArrayOutputStream;
        this.f70041b = map;
        this.f70042c = map2;
        this.f70043d = fp6Var;
    }

    /* JADX INFO: renamed from: j */
    public static int m25188j(c33 c33Var) {
        wkb wkbVar = (wkb) c33Var.m4297b(wkb.class);
        if (wkbVar != null) {
            return wkbVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: a */
    public final gp6 mo12789a(c33 c33Var, Object obj) {
        m25190c(c33Var, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m25189b(c33 c33Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m25194l((m25188j(c33Var) << 3) | 1);
        this.f70040a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    /* JADX INFO: renamed from: c */
    public final void m25190c(c33 c33Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m25194l((m25188j(c33Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f70036f);
            m25194l(bytes.length);
            this.f70040a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m25190c(c33Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m25193k(f70039i, c33Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m25189b(c33Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m25194l((m25188j(c33Var) << 3) | 5);
            this.f70040a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m25192i(c33Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            m25191h(c33Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m25194l((m25188j(c33Var) << 3) | 2);
            m25194l(bArr.length);
            this.f70040a.write(bArr);
            return;
        }
        fp6 fp6Var = (fp6) this.f70041b.get(obj.getClass());
        if (fp6Var != null) {
            m25193k(fp6Var, c33Var, obj, z);
            return;
        }
        yna ynaVar = (yna) this.f70042c.get(obj.getClass());
        if (ynaVar != null) {
            lmb lmbVar = this.f70044e;
            lmbVar.f49843b = false;
            lmbVar.f49845d = c33Var;
            lmbVar.f49844c = z;
            ynaVar.mo24a(obj, lmbVar);
            return;
        }
        if (obj instanceof ljb) {
            m25191h(c33Var, ((ljb) obj).zza(), true);
        } else if (obj instanceof Enum) {
            m25191h(c33Var, ((Enum) obj).ordinal(), true);
        } else {
            m25193k(this.f70043d, c33Var, obj, z);
        }
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gp6 mo12790d(c33 c33Var, boolean z) {
        m25191h(c33Var, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gp6 mo12791e(c33 c33Var, int i) {
        m25191h(c33Var, i, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: f */
    public final gp6 mo12792f(c33 c33Var, double d) throws IOException {
        m25189b(c33Var, d, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gp6 mo12793g(c33 c33Var, long j) throws IOException {
        m25192i(c33Var, j, true);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m25191h(c33 c33Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        wkb wkbVar = (wkb) c33Var.m4297b(wkb.class);
        if (wkbVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        zzah zzahVar = zzah.DEFAULT;
        int iOrdinal = wkbVar.zzb().ordinal();
        if (iOrdinal == 0) {
            m25194l(wkbVar.zza() << 3);
            m25194l(i);
        } else if (iOrdinal == 1) {
            m25194l(wkbVar.zza() << 3);
            m25194l((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m25194l((wkbVar.zza() << 3) | 5);
            this.f70040a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m25192i(c33 c33Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        wkb wkbVar = (wkb) c33Var.m4297b(wkb.class);
        if (wkbVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        zzah zzahVar = zzah.DEFAULT;
        int iOrdinal = wkbVar.zzb().ordinal();
        if (iOrdinal == 0) {
            m25194l(wkbVar.zza() << 3);
            m25195m(j);
        } else if (iOrdinal == 1) {
            m25194l(wkbVar.zza() << 3);
            m25195m((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m25194l((wkbVar.zza() << 3) | 1);
            this.f70040a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m25193k(fp6 fp6Var, c33 c33Var, Object obj, boolean z) throws IOException {
        tib tibVar = new tib(0);
        tibVar.f62352b = 0L;
        try {
            OutputStream outputStream = this.f70040a;
            this.f70040a = tibVar;
            try {
                fp6Var.mo24a(obj, this);
                this.f70040a = outputStream;
                long j = tibVar.f62352b;
                tibVar.close();
                if (z && j == 0) {
                    return;
                }
                m25194l((m25188j(c33Var) << 3) | 2);
                m25195m(j);
                fp6Var.mo24a(obj, this);
            } catch (Throwable th) {
                this.f70040a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                tibVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m25194l(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.f70040a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m25195m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f70040a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
