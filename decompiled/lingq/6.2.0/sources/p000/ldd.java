package p000;

import com.google.android.gms.internal.clearcut.zzbb;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ldd {
    /* JADX INFO: renamed from: a */
    public static ArrayList m16141a(File file) {
        j43 j43Var = new j43();
        if (!file.isDirectory()) {
            return null;
        }
        String[] list = file.list(j43Var);
        if (list != null && list.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                File file2 = new File(AbstractC3393o1.m17735j(file.getAbsolutePath(), File.separator, str));
                if (file2.exists()) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static String m16142b(zzbb zzbbVar) {
        String str;
        StringBuilder sb = new StringBuilder(zzbbVar.size());
        for (int i = 0; i < zzbbVar.size(); i++) {
            int iMo5343f = zzbbVar.mo5343f(i);
            if (iMo5343f == 34) {
                str = "\\\"";
            } else if (iMo5343f == 39) {
                str = "\\'";
            } else if (iMo5343f != 92) {
                switch (iMo5343f) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iMo5343f < 32 || iMo5343f > 126) {
                            sb.append('\\');
                            sb.append((char) (((iMo5343f >>> 6) & 3) + 48));
                            sb.append((char) (((iMo5343f >>> 3) & 7) + 48));
                            iMo5343f = (iMo5343f & 7) + 48;
                        }
                        sb.append((char) iMo5343f);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
