package p214k5;

import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import dm.C5206f;
import dm.C5207g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p026b5.C1309b;
import sl.C9072e;

/* JADX INFO: renamed from: k5.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6623y {

    /* JADX INFO: renamed from: k5.y$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37561a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f37562b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f37563c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f37564d;

        static {
            int[] iArr = new int[WorkInfo$State.values().length];
            try {
                iArr[WorkInfo$State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo$State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo$State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo$State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo$State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo$State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f37561a = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f37562b = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f37563c = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f37564d = iArr4;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet m13247a(byte[] bArr) throws IOException {
        C5207g.m11111f(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        C5207g.m11110e(uri, "uri");
                        linkedHashSet.add(new C1309b.a(z10, uri));
                    }
                    C9072e c9072e = C9072e.f47360a;
                    C5206f.m11032z0(objectInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C5206f.m11032z0(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            C9072e c9072e2 = C9072e.f47360a;
            C5206f.m11032z0(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C5206f.m11032z0(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final BackoffPolicy m13248b(int i10) {
        if (i10 == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i10 == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException(C0166e.m762h("Could not convert ", i10, " to BackoffPolicy"));
    }

    /* JADX INFO: renamed from: c */
    public static final NetworkType m13249c(int i10) {
        if (i10 == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return NetworkType.CONNECTED;
        }
        if (i10 == 2) {
            return NetworkType.UNMETERED;
        }
        if (i10 == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i10 == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(C0166e.m762h("Could not convert ", i10, " to NetworkType"));
        }
        return NetworkType.TEMPORARILY_UNMETERED;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static final OutOfQuotaPolicy m13250d(int i10) {
        if (i10 == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(C0166e.m762h("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    /* JADX INFO: renamed from: e */
    public static final WorkInfo$State m13251e(int i10) {
        if (i10 == 0) {
            return WorkInfo$State.ENQUEUED;
        }
        if (i10 == 1) {
            return WorkInfo$State.RUNNING;
        }
        if (i10 == 2) {
            return WorkInfo$State.SUCCEEDED;
        }
        if (i10 == 3) {
            return WorkInfo$State.FAILED;
        }
        if (i10 == 4) {
            return WorkInfo$State.BLOCKED;
        }
        if (i10 == 5) {
            return WorkInfo$State.CANCELLED;
        }
        throw new IllegalArgumentException(C0166e.m762h("Could not convert ", i10, " to State"));
    }

    /* JADX INFO: renamed from: f */
    public static final int m13252f(NetworkType networkType) {
        C5207g.m11111f(networkType, "networkType");
        int i10 = a.f37563c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            i11 = 4;
            if (i10 == 4) {
                return 3;
            }
            if (i10 != 5) {
                if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: g */
    public static final byte[] m13253g(Set<C1309b.a> set) throws IOException {
        C5207g.m11111f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                for (C1309b.a aVar : set) {
                    objectOutputStream.writeUTF(aVar.f8054a.toString());
                    objectOutputStream.writeBoolean(aVar.f8055b);
                }
                C9072e c9072e = C9072e.f47360a;
                C5206f.m11032z0(objectOutputStream, null);
                C5206f.m11032z0(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C5207g.m11110e(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C5206f.m11032z0(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C5206f.m11032z0(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final int m13254h(WorkInfo$State workInfo$State) {
        C5207g.m11111f(workInfo$State, "state");
        switch (a.f37561a[workInfo$State.ordinal()]) {
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
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
