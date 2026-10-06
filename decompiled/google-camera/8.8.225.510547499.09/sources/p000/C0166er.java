package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: er */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0166er {
    /* JADX INFO: renamed from: a */
    static int m7712a(Configuration configuration) {
        return configuration.getLayoutDirection();
    }

    /* JADX INFO: renamed from: b */
    static Context m7713b(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: c */
    static void m7714c(Configuration configuration, Locale locale) {
        configuration.setLayoutDirection(locale);
    }

    /* JADX INFO: renamed from: d */
    static void m7715d(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: e */
    static void m7716e(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    /* JADX INFO: renamed from: h */
    public static int m7717h(WorkDatabase workDatabase, String str) {
        Long lMo2191a = workDatabase.mo1703x().mo2191a(str);
        int iLongValue = lMo2191a != null ? (int) lMo2191a.longValue() : 0;
        m7718i(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    /* JADX INFO: renamed from: i */
    public static void m7718i(WorkDatabase workDatabase, String str, int i) {
        workDatabase.mo1703x().mo2192b(new bby(str, Long.valueOf(i)));
    }

    /* JADX INFO: renamed from: j */
    public static Set m7719j(byte[] bArr) throws IOException {
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
                        linkedHashSet.add(new axq(uri, z));
                    }
                    omn.m18709n(objectInputStream, null);
                    omn.m18709n(byteArrayInputStream, null);
                    return linkedHashSet;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        omn.m18709n(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                omn.m18709n(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m7720k(Set set) throws IOException {
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
                    axq axqVar = (axq) it.next();
                    objectOutputStream.writeUTF(axqVar.f2676a.toString());
                    objectOutputStream.writeBoolean(axqVar.f2677b);
                }
                omn.m18709n(objectOutputStream, null);
                omn.m18709n(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    omn.m18709n(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                omn.m18709n(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m7721l(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                return 0;
            default:
                return 1;
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m7722m(int i) {
        String str;
        switch (i - 1) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                if (i == 6) {
                    return 5;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                switch (i) {
                    case 1:
                        str = "NOT_REQUIRED";
                        break;
                    case 2:
                        str = "CONNECTED";
                        break;
                    case 3:
                        str = "UNMETERED";
                        break;
                    case 4:
                        str = "NOT_ROAMING";
                        break;
                    default:
                        str = "METERED";
                        break;
                }
                sb.append((Object) str);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m7723n(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                return 0;
            default:
                return 1;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m7724o(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 5;
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m7725p(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m7726q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                if (i == 5) {
                    return 6;
                }
                throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m7727r(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m7728s(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                throw new IllegalArgumentException("Could not convert " + i + " to State");
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo1749f(Rect rect, View view, RecyclerView recyclerView) {
        ((C0813lz) view.getLayoutParams()).m16218a();
        rect.set(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: g */
    public void mo1750g(Canvas canvas, RecyclerView recyclerView) {
    }
}
