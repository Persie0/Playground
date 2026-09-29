package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.p010v1.SessionVerbosity;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import p000.C3670v2;
import p000.b77;
import p000.c77;
import p000.dh1;
import p000.mz6;
import p000.s46;
import p000.uh1;
import p000.xh1;

/* JADX INFO: loaded from: classes.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new C3670v2(7);

    /* JADX INFO: renamed from: a */
    public final String f13784a;

    /* JADX INFO: renamed from: b */
    public final Timer f13785b;

    /* JADX INFO: renamed from: c */
    public boolean f13786c;

    public PerfSession(Parcel parcel) {
        this.f13786c = false;
        this.f13784a = parcel.readString();
        this.f13786c = parcel.readByte() != 0;
        this.f13785b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }

    /* JADX INFO: renamed from: b */
    public static c77[] m6733b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        c77[] c77VarArr = new c77[list.size()];
        c77 c77VarM6735a = ((PerfSession) list.get(0)).m6735a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            c77 c77VarM6735a2 = ((PerfSession) list.get(i)).m6735a();
            if (z || !((PerfSession) list.get(i)).f13786c) {
                c77VarArr[i] = c77VarM6735a2;
            } else {
                c77VarArr[0] = c77VarM6735a2;
                c77VarArr[i] = c77VarM6735a;
                z = true;
            }
        }
        if (!z) {
            c77VarArr[0] = c77VarM6735a;
        }
        return c77VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX INFO: renamed from: c */
    public static PerfSession m6734c(String str) {
        boolean z;
        xh1 xh1Var;
        mz6 mz6Var;
        mz6 mz6VarM10382b;
        double dDoubleValue;
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new s46(8));
        dh1 dh1VarM10376e = dh1.m10376e();
        if (dh1VarM10376e.m10390n()) {
            double dRandom = Math.random();
            synchronized (xh1.class) {
                try {
                    if (xh1.f68196h == null) {
                        xh1.f68196h = new xh1();
                    }
                    xh1Var = xh1.f68196h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mz6 mz6VarM10387h = dh1VarM10376e.m10387h(xh1Var);
            if (mz6VarM10387h.m17160b()) {
                dDoubleValue = ((Double) mz6VarM10387h.m17159a()).doubleValue() / 100.0d;
                if (!dh1.m10380o(dDoubleValue)) {
                    mz6Var = dh1VarM10376e.f35642a.getDouble("fpr_vc_session_sampling_rate");
                    if (mz6Var.m17160b() || !dh1.m10380o(((Double) mz6Var.m17159a()).doubleValue())) {
                        mz6VarM10382b = dh1VarM10376e.m10382b(xh1Var);
                        if (!mz6VarM10382b.m17160b() && dh1.m10380o(((Double) mz6VarM10382b.m17159a()).doubleValue())) {
                            dDoubleValue = ((Double) mz6VarM10382b.m17159a()).doubleValue();
                        } else if (dh1VarM10376e.f35642a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else {
                        dh1VarM10376e.f35644c.m23846d(((Double) mz6Var.m17159a()).doubleValue(), "com.google.firebase.perf.SessionSamplingRate");
                        dDoubleValue = ((Double) mz6Var.m17159a()).doubleValue();
                    }
                }
            } else {
                mz6Var = dh1VarM10376e.f35642a.getDouble("fpr_vc_session_sampling_rate");
                if (mz6Var.m17160b()) {
                    mz6VarM10382b = dh1VarM10376e.m10382b(xh1Var);
                    if (!mz6VarM10382b.m17160b()) {
                        if (dh1VarM10376e.f35642a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (dh1VarM10376e.f35642a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                } else {
                    mz6VarM10382b = dh1VarM10376e.m10382b(xh1Var);
                    if (!mz6VarM10382b.m17160b()) {
                        if (dh1VarM10376e.f35642a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (dh1VarM10376e.f35642a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                }
            }
            if (dRandom < dDoubleValue) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        perfSession.f13786c = z;
        return perfSession;
    }

    /* JADX INFO: renamed from: a */
    public final c77 m6735a() {
        b77 b77VarM4391w = c77.m4391w();
        b77VarM4391w.m22767h();
        c77.m4389s((c77) b77VarM4391w.f64019b, this.f13784a);
        if (this.f13786c) {
            SessionVerbosity sessionVerbosity = SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
            b77VarM4391w.m22767h();
            c77.m4390t((c77) b77VarM4391w.f64019b, sessionVerbosity);
        }
        return (c77) b77VarM4391w.m22766g();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6736d() {
        uh1 uh1Var;
        long jLongValue;
        long jM6742a = this.f13785b.m6742a() / 60000000;
        dh1 dh1VarM10376e = dh1.m10376e();
        dh1VarM10376e.getClass();
        synchronized (uh1.class) {
            try {
                if (uh1.f63924h == null) {
                    uh1.f63924h = new uh1();
                }
                uh1Var = uh1.f63924h;
            } catch (Throwable th) {
                throw th;
            }
        }
        mz6 mz6VarM10388i = dh1VarM10376e.m10388i(uh1Var);
        if (!mz6VarM10388i.m17160b() || ((Long) mz6VarM10388i.m17159a()).longValue() <= 0) {
            mz6 mz6Var = dh1VarM10376e.f35642a.getLong("fpr_session_max_duration_min");
            if (!mz6Var.m17160b() || ((Long) mz6Var.m17159a()).longValue() <= 0) {
                mz6 mz6VarM10383c = dh1VarM10376e.m10383c(uh1Var);
                jLongValue = (!mz6VarM10383c.m17160b() || ((Long) mz6VarM10383c.m17159a()).longValue() <= 0) ? 240L : ((Long) mz6VarM10383c.m17159a()).longValue();
            } else {
                dh1VarM10376e.f35644c.m23847e("com.google.firebase.perf.SessionsMaxDurationMinutes", ((Long) mz6Var.m17159a()).longValue());
                jLongValue = ((Long) mz6Var.m17159a()).longValue();
            }
        } else {
            jLongValue = ((Long) mz6VarM10388i.m17159a()).longValue();
        }
        return jM6742a > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13784a);
        parcel.writeByte(this.f13786c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f13785b, 0);
    }

    public PerfSession(String str, s46 s46Var) {
        this.f13786c = false;
        this.f13784a = str;
        this.f13785b = new Timer();
    }
}
