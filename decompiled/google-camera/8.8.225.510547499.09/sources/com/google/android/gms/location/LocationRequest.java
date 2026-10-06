package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.lang.reflect.Method;
import java.util.Arrays;
import p000.jib;
import p000.jij;
import p000.jix;
import p000.jiy;
import p000.jms;
import p000.jnf;
import p000.jnz;
import p000.jpd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jnf();

    /* JADX INFO: renamed from: a */
    public int f7753a;

    /* JADX INFO: renamed from: b */
    public long f7754b;

    /* JADX INFO: renamed from: c */
    public long f7755c;

    /* JADX INFO: renamed from: d */
    public long f7756d;

    /* JADX INFO: renamed from: e */
    public long f7757e;

    /* JADX INFO: renamed from: f */
    public int f7758f;

    /* JADX INFO: renamed from: g */
    public float f7759g;

    /* JADX INFO: renamed from: h */
    public boolean f7760h;

    /* JADX INFO: renamed from: i */
    public long f7761i;

    /* JADX INFO: renamed from: j */
    public final int f7762j;

    /* JADX INFO: renamed from: k */
    public final int f7763k;

    /* JADX INFO: renamed from: l */
    public final String f7764l;

    /* JADX INFO: renamed from: m */
    public final boolean f7765m;

    /* JADX INFO: renamed from: n */
    public final WorkSource f7766n;

    /* JADX INFO: renamed from: o */
    public final jms f7767o;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    /* JADX INFO: renamed from: c */
    private static String m4665c(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        synchronized (jnz.f34436a) {
            jnz.f34436a.setLength(0);
            StringBuilder sb = jnz.f34436a;
            jnz.m13398a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4666a() {
        long j = this.f7756d;
        return j > 0 && (j >> 1) >= this.f7754b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4667b() {
        return this.f7753a == 105;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f7753a == locationRequest.f7753a && ((m4667b() || this.f7754b == locationRequest.f7754b) && this.f7755c == locationRequest.f7755c && m4666a() == locationRequest.m4666a() && ((!m4666a() || this.f7756d == locationRequest.f7756d) && this.f7757e == locationRequest.f7757e && this.f7758f == locationRequest.f7758f && this.f7759g == locationRequest.f7759g && this.f7760h == locationRequest.f7760h && this.f7762j == locationRequest.f7762j && this.f7763k == locationRequest.f7763k && this.f7765m == locationRequest.f7765m && this.f7766n.equals(locationRequest.f7766n) && jib.m13209n(this.f7764l, locationRequest.f7764l) && jib.m13209n(this.f7767o, locationRequest.f7767o)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7753a), Long.valueOf(this.f7754b), Long.valueOf(this.f7755c), this.f7766n});
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final String toString() {
        Method method;
        Object objInvoke;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (m4667b()) {
            sb.append(jpd.m13423d(this.f7753a));
        } else {
            sb.append("@");
            if (m4666a()) {
                jnz.m13398a(this.f7754b, sb);
                sb.append("/");
                jnz.m13398a(this.f7756d, sb);
            } else {
                jnz.m13398a(this.f7754b, sb);
            }
            sb.append(" ");
            sb.append(jpd.m13423d(this.f7753a));
        }
        if (m4667b() || this.f7755c != this.f7754b) {
            sb.append(", minUpdateInterval=");
            sb.append(m4665c(this.f7755c));
        }
        if (this.f7759g > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f7759g);
        }
        if (!m4667b() ? this.f7761i != this.f7754b : this.f7761i != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(m4665c(this.f7761i));
        }
        if (this.f7757e != Long.MAX_VALUE) {
            sb.append(", duration=");
            jnz.m13398a(this.f7757e, sb);
        }
        if (this.f7758f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f7758f);
        }
        if (this.f7763k != 0) {
            sb.append(", ");
            switch (this.f7763k) {
                case 0:
                    str = "THROTTLE_BACKGROUND";
                    break;
                case 1:
                    str = "THROTTLE_ALWAYS";
                    break;
                case 2:
                    str = "THROTTLE_NEVER";
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            sb.append(str);
        }
        if (this.f7762j != 0) {
            sb.append(", ");
            sb.append(jpd.m13425f(this.f7762j));
        }
        if (this.f7760h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.f7765m) {
            sb.append(", bypass");
        }
        if (this.f7764l != null) {
            sb.append(", moduleId=");
            sb.append(this.f7764l);
        }
        WorkSource workSource = this.f7766n;
        Method method2 = jix.f34146b;
        if (method2 != null) {
            try {
                Object objInvoke2 = method2.invoke(workSource, new Object[0]);
                jib.m13205j(objInvoke2);
                if (!((Boolean) objInvoke2).booleanValue()) {
                    sb.append(", ");
                    sb.append(this.f7766n);
                }
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
                method = jix.f34145a;
                if (method != null) {
                    try {
                        objInvoke = method.invoke(workSource, new Object[0]);
                        jib.m13205j(objInvoke);
                        if (((Integer) objInvoke).intValue() != 0) {
                            sb.append(", ");
                            sb.append(this.f7766n);
                        }
                    } catch (Exception e2) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                    }
                }
            }
        } else {
            method = jix.f34145a;
            if (method != null) {
                objInvoke = method.invoke(workSource, new Object[0]);
                jib.m13205j(objInvoke);
                if (((Integer) objInvoke).intValue() != 0) {
                    sb.append(", ");
                    sb.append(this.f7766n);
                }
            }
        }
        if (this.f7767o != null) {
            sb.append(", impersonation=");
            sb.append(this.f7767o);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f7753a);
        jiy.m13288o(parcel, 2, this.f7754b);
        jiy.m13288o(parcel, 3, this.f7755c);
        jiy.m13287n(parcel, 6, this.f7758f);
        float f = this.f7759g;
        jiy.m13286m(parcel, 7, 4);
        parcel.writeFloat(f);
        jiy.m13288o(parcel, 8, this.f7756d);
        jiy.m13284k(parcel, 9, this.f7760h);
        jiy.m13288o(parcel, 10, this.f7757e);
        jiy.m13288o(parcel, 11, this.f7761i);
        jiy.m13287n(parcel, 12, this.f7762j);
        jiy.m13287n(parcel, 13, this.f7763k);
        jiy.m13296w(parcel, 14, this.f7764l);
        jiy.m13284k(parcel, 15, this.f7765m);
        jiy.m13295v(parcel, 16, this.f7766n, i);
        jiy.m13295v(parcel, 17, this.f7767o, i);
        jiy.m13283j(parcel, iM13281h);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, String str, boolean z2, WorkSource workSource, jms jmsVar) {
        this.f7753a = i;
        long j7 = j;
        this.f7754b = j7;
        this.f7755c = j2;
        this.f7756d = j3;
        this.f7757e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f7758f = i2;
        this.f7759g = f;
        this.f7760h = z;
        this.f7761i = j6 != -1 ? j6 : j7;
        this.f7762j = i3;
        this.f7763k = i4;
        this.f7764l = str;
        this.f7765m = z2;
        this.f7766n = workSource;
        this.f7767o = jmsVar;
    }
}
