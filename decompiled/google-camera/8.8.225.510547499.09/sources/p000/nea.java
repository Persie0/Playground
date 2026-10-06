package p000;

import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.flogger.backend.system.DefaultPlatform;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.function.Function;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nea {
    /* JADX INFO: renamed from: d */
    public static String m17390d(String str, String str2, boolean z) {
        if (str.length() + str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        String strConcat = str.concat(String.valueOf(str2));
        return !z ? strConcat : strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    /* JADX INFO: renamed from: e */
    public static int m17391e(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    /* JADX INFO: renamed from: f */
    public static ndk m17392f() {
        try {
            return (ndk) ndt.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e) {
            try {
                return (ndk) GooglePlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e2) {
                try {
                    return (ndk) DefaultPlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e3) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m17393g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to create parent directories of ");
        sb.append(file);
        throw new IOException("Unable to create parent directories of ".concat(file.toString()));
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m17394h(File file) {
        file.getClass();
        return ngd.m17461a(file);
    }

    /* JADX INFO: renamed from: i */
    public static void m17395i(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m17396j(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static void m17397k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    /* JADX INFO: renamed from: l */
    public static int[] m17398l() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m17399m(int i) {
        switch (i) {
            case 2:
                return "START_FLOW";
            case 3:
                return "CONFIRMATION";
            default:
                return "INSTALL";
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m17400n(int i) {
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
                return 0;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int[] m17401o() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    /* JADX INFO: renamed from: p */
    public static String m17402p(int i) {
        return Integer.toString(i - 1);
    }

    /* JADX INFO: renamed from: q */
    public static int m17403q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return 0;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m17404r(int i) {
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
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public static ngh m17405s(final ngh nghVar, final ngh nghVar2) {
        return new ngh() { // from class: nge
            @Override // p000.ngh
            /* JADX INFO: renamed from: a */
            public final int mo17462a(Object obj, Object obj2, Object obj3, Object obj4) {
                ngh nghVar3 = nghVar;
                ngh nghVar4 = nghVar2;
                int iMo17462a = nghVar3.mo17462a(obj, obj2, obj3, obj4);
                return iMo17462a == 0 ? nghVar4.mo17462a(obj, obj2, obj3, obj4) : iMo17462a;
            }

            @Override // p000.ngh
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ngh mo17463b(ngh nghVar3) {
                return nea.m17405s(this, nghVar3);
            }

            @Override // p000.ngh
            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Comparator mo17464c(Function function, Function function2) {
                return nea.m17406t(this, function, function2);
            }
        };
    }

    /* JADX INFO: renamed from: t */
    public static Comparator m17406t(final ngh nghVar, final Function function, final Function function2) {
        function.getClass();
        function2.getClass();
        return new Comparator() { // from class: ngg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                ngh nghVar2 = nghVar;
                Function function3 = function;
                Function function4 = function2;
                return nghVar2.mo17462a(function3.apply(obj), function4.apply(obj), function3.apply(obj2), function4.apply(obj2));
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public ncr mo17385a() {
        return ncq.f42022a;
    }

    /* JADX INFO: renamed from: b */
    public nei mo17386b() {
        return nei.f42107b;
    }

    /* JADX INFO: renamed from: c */
    public void mo17387c(String str, Level level, boolean z) {
    }
}
