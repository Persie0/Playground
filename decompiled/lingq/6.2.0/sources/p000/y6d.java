package p000;

import androidx.glance.appwidget.protobuf.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y6d {

    /* JADX INFO: renamed from: a */
    public static p04 f69389a;

    /* JADX INFO: renamed from: a */
    public static String m24964a(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte bMo2262d = byteString.mo2262d(i);
            if (bMo2262d == 34) {
                sb.append("\\\"");
            } else if (bMo2262d == 39) {
                sb.append("\\'");
            } else if (bMo2262d != 92) {
                switch (bMo2262d) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo2262d < 32 || bMo2262d > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo2262d >>> 6) & 3) + 48));
                            sb.append((char) (((bMo2262d >>> 3) & 7) + 48));
                            sb.append((char) ((bMo2262d & 7) + 48));
                        } else {
                            sb.append((char) bMo2262d);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
