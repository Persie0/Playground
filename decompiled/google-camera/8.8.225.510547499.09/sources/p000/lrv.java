package p000;

import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.common.p019io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lrv {

    /* JADX INFO: renamed from: a */
    public static final Logger f39107a = Logger.getLogger("XmpUtil");

    /* JADX INFO: renamed from: a */
    public static bfd m15923a(InputStream inputStream) {
        Iterator it;
        int i;
        bfd bfdVarM2325a;
        bfd bfdVarM2325a2;
        int length;
        int i2;
        ArrayList<nax> arrayList = new ArrayList();
        try {
            try {
                if (inputStream != null) {
                    try {
                        if (inputStream.read() == 255 && inputStream.read() == 216) {
                            while (true) {
                                int i3 = inputStream.read();
                                if (i3 == -1) {
                                    inputStream.close();
                                    break;
                                }
                                if (i3 != 255) {
                                    inputStream.close();
                                    break;
                                }
                                do {
                                    i2 = inputStream.read();
                                } while (i2 == 255);
                                if (i2 == -1) {
                                    inputStream.close();
                                    break;
                                }
                                if (i2 == 218) {
                                    inputStream.close();
                                    break;
                                }
                                int i4 = inputStream.read();
                                int i5 = inputStream.read();
                                if (i4 == -1 || i5 == -1) {
                                    inputStream.close();
                                    break;
                                }
                                int i6 = (i4 << 8) | i5;
                                if (i6 < 2) {
                                    inputStream.close();
                                    break;
                                }
                                if (i2 == 225) {
                                    nax naxVar = new nax();
                                    naxVar.f41919a = new byte[i6 - 2];
                                    ByteStreams.readFully(inputStream, (byte[]) naxVar.f41919a);
                                    arrayList.add(naxVar);
                                } else {
                                    ByteStreams.skipFully(inputStream, i6 - 2);
                                }
                            }
                        } else {
                            f39107a.logp(Level.INFO, "com.google.android.libraries.social.xmp.XmpUtil", "parse", "XMP parse: only JPEG file is supported");
                            inputStream.close();
                        }
                    } catch (IOException e) {
                        f39107a.logp(Level.INFO, "com.google.android.libraries.social.xmp.XmpUtil", "parse", "Could not parse file.", (Throwable) e);
                        inputStream.close();
                    }
                }
                while (true) {
                    bfdVarM2325a = null;
                    if (!it.hasNext()) {
                        bfdVarM2325a2 = null;
                        break;
                    }
                    nax naxVar2 = (nax) it.next();
                    if (m15924b((byte[]) naxVar2.f41919a, "http://ns.adobe.com/xap/1.0/\u0000")) {
                        byte[] bArr = (byte[]) naxVar2.f41919a;
                        int length2 = bArr.length - 1;
                        while (true) {
                            if (length2 <= 0) {
                                length = bArr.length;
                                break;
                            }
                            if (bArr[length2] == 62 && bArr[length2 - 1] != 63) {
                                length = length2 + 1;
                                break;
                            }
                            length2--;
                        }
                        int i7 = length - 29;
                        byte[] bArr2 = new byte[i7];
                        System.arraycopy(naxVar2.f41919a, 29, bArr2, 0, i7);
                        try {
                            cvy cvyVar = bff.f3083a;
                            bfdVarM2325a2 = bfs.m2325a(bArr2);
                            break;
                        } catch (bfc e2) {
                            f39107a.logp(Level.INFO, "com.google.android.libraries.social.xmp.XmpUtil", "parseFirstValidXMPSection", "XMP parse error", (Throwable) e2);
                            bfdVarM2325a2 = null;
                            break;
                        } catch (RuntimeException e3) {
                            f39107a.logp(Level.WARNING, "com.google.android.libraries.social.xmp.XmpUtil", "parseFirstValidXMPSection", "Unexpected exception when parsing XMP", (Throwable) e3);
                            bfdVarM2325a2 = null;
                            break;
                        }
                    }
                }
            } catch (IOException e4) {
            }
            it = arrayList.iterator();
            if (bfdVarM2325a2 != null && bfdVarM2325a2.mo2294e("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")) {
                try {
                    String str = "http://ns.adobe.com/xmp/extension/\u0000" + ((String) ((bfq) bfdVarM2325a2.mo2290a("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")).f3125a) + "\u0000";
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i8 = 0;
                    for (nax naxVar3 : arrayList) {
                        if (m15924b((byte[]) naxVar3.f41919a, str)) {
                            int length3 = str.length() + 7;
                            int length4 = ((byte[]) naxVar3.f41919a).length;
                            i8 += length4 - length3;
                            arrayList2.add(naxVar3);
                            arrayList3.add(Integer.valueOf(length3));
                            arrayList4.add(Integer.valueOf(length4));
                        }
                    }
                    byte[] bArr3 = new byte[i8];
                    int i9 = 0;
                    for (i = 0; i < arrayList2.size(); i++) {
                        nax naxVar4 = (nax) arrayList2.get(i);
                        int iIntValue = ((Integer) arrayList3.get(i)).intValue();
                        int iIntValue2 = ((Integer) arrayList4.get(i)).intValue() - iIntValue;
                        System.arraycopy(naxVar4.f41919a, iIntValue, bArr3, i9, iIntValue2);
                        i9 += iIntValue2;
                    }
                    try {
                        cvy cvyVar2 = bff.f3083a;
                        bfdVarM2325a = bfs.m2325a(bArr3);
                    } catch (bfc e5) {
                        f39107a.logp(Level.INFO, "com.google.android.libraries.social.xmp.XmpUtil", "parseExtendedXMPSections", "Extended XMP parse error", (Throwable) e5);
                    } catch (RuntimeException e6) {
                        f39107a.logp(Level.WARNING, "com.google.android.libraries.social.xmp.XmpUtil", "parseExtendedXMPSections", qQLA.PLSBTGvLnIZ, (Throwable) e6);
                    }
                    if (bfdVarM2325a != null) {
                        try {
                            bfp bfpVarMo2295f = bfdVarM2325a.mo2295f();
                            while (true) {
                                bfm bfmVar = (bfm) bfpVarMo2295f.next();
                                String str2 = bfmVar.f3107b;
                                if (str2 != null) {
                                    bfdVarM2325a2.mo2293d(bfmVar.f3106a, str2, bfmVar.f3108c, bfmVar.m2318a());
                                }
                            }
                        } catch (Exception e7) {
                        }
                    }
                } catch (bfc e8) {
                    e8.printStackTrace();
                }
            }
            return bfdVarM2325a2;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e9) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m15924b(byte[] bArr, String str) {
        if (bArr.length < str.length()) {
            return false;
        }
        try {
            byte[] bArr2 = new byte[str.length()];
            System.arraycopy(bArr, 0, bArr2, 0, str.length());
            return new String(bArr2, "UTF-8").equals(str);
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }
}
