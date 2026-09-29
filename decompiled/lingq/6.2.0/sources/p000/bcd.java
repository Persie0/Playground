package p000;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bcd {
    /* JADX INFO: renamed from: a */
    public static final void m3619a(EmbeddedMessage embeddedMessage, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(133016700);
        int i2 = (tj3Var.m22124i(embeddedMessage) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22120g(e16Var) ? 256 : 128);
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            r46.m20382g(c99.m4414g(e16Var, 200.0f), null, null, null, null, null, ci8.m4703P(1799571542, new op2(embeddedMessage, vi3Var, i3), tj3Var), tj3Var, 1572864, 62);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pp2(embeddedMessage, vi3Var, e16Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m3620b(BackoffPolicy backoffPolicy) {
        backoffPolicy.getClass();
        int i = x8b.f67938b[backoffPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            gm5.m12750e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static final LinkedHashSet m3621c(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new yj1(z, uri));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3584sr.m21646y(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3584sr.m21646y(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final byte[] m3622d(gk6 gk6Var) throws IOException {
        int[] iArrM22621m1;
        int[] iArrM22621m2;
        gk6Var.getClass();
        NetworkRequest networkRequest = (NetworkRequest) gk6Var.f40912a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrM22621m1 = networkRequest.getTransportTypes();
                    iArrM22621m1.getClass();
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 10; i++) {
                        int i2 = iArr[i];
                        if (networkRequest.hasTransport(i2)) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    iArrM22621m1 = u91.m22621m1(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrM22621m2 = networkRequest.getCapabilities();
                    iArrM22621m2.getClass();
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < 30; i3++) {
                        int i4 = iArr2[i3];
                        if (networkRequest.hasCapability(i4)) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                    iArrM22621m2 = u91.m22621m1(arrayList2);
                }
                objectOutputStream.writeInt(iArrM22621m1.length);
                for (int i5 : iArrM22621m1) {
                    objectOutputStream.writeInt(i5);
                }
                objectOutputStream.writeInt(iArrM22621m2.length);
                for (int i6 : iArrM22621m2) {
                    objectOutputStream.writeInt(i6);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3584sr.m21646y(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final BackoffPolicy m3623e(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        C3386nv.m17626m(ux5.m22989l("Could not convert ", i, " to BackoffPolicy"));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final NetworkType m3624f(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        C3386nv.m17626m(ux5.m22989l("Could not convert ", i, " to NetworkType"));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final OutOfQuotaPolicy m3625g(int i) {
        if (i == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        C3386nv.m17626m(ux5.m22989l("Could not convert ", i, " to OutOfQuotaPolicy"));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final WorkInfo$State m3626h(int i) {
        if (i == 0) {
            return WorkInfo$State.ENQUEUED;
        }
        if (i == 1) {
            return WorkInfo$State.RUNNING;
        }
        if (i == 2) {
            return WorkInfo$State.SUCCEEDED;
        }
        if (i == 3) {
            return WorkInfo$State.FAILED;
        }
        if (i == 4) {
            return WorkInfo$State.BLOCKED;
        }
        if (i == 5) {
            return WorkInfo$State.CANCELLED;
        }
        C3386nv.m17626m(ux5.m22989l("Could not convert ", i, " to State"));
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final int m3627i(NetworkType networkType) {
        networkType.getClass();
        int i = x8b.f67939c[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        ij6.m13965w("Could not convert ", networkType, " to int");
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static final int m3628j(OutOfQuotaPolicy outOfQuotaPolicy) {
        outOfQuotaPolicy.getClass();
        int i = x8b.f67940d[outOfQuotaPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            gm5.m12750e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static final byte[] m3629k(Set set) throws IOException {
        set.getClass();
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    yj1 yj1Var = (yj1) it.next();
                    objectOutputStream.writeUTF(yj1Var.f69902a.toString());
                    objectOutputStream.writeBoolean(yj1Var.f69903b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3584sr.m21646y(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final int m3630l(WorkInfo$State workInfo$State) {
        workInfo$State.getClass();
        switch (x8b.f67937a[workInfo$State.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                gm5.m12750e();
                return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final gk6 m3631m(byte[] bArr) throws IOException {
        bArr.getClass();
        if (bArr.length == 0) {
            return new gk6(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                gk6 gk6VarM17028a = mrb.m17028a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return gk6VarM17028a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3584sr.m21646y(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }
}
