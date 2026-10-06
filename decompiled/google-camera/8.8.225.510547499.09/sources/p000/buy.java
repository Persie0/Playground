package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buy implements bra {

    /* JADX INFO: renamed from: a */
    private Object f4511a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4512b;

    /* JADX INFO: renamed from: c */
    private final Object f4513c;

    /* JADX INFO: renamed from: d */
    private final Object f4514d;

    public buy(Uri uri, cvy cvyVar, int i, byte[] bArr) {
        this.f4512b = i;
        this.f4514d = uri;
        this.f4513c = cvyVar;
    }

    public buy(File file, buz buzVar, int i) {
        this.f4512b = i;
        this.f4513c = file;
        this.f4514d = buzVar;
    }

    /* JADX INFO: renamed from: b */
    public static buy m3089b(Context context, Uri uri, brt brtVar) {
        return new buy(uri, new cvy(box.m2826b(context).f4033b.m2831a().m2834b(), brtVar, box.m2826b(context).f4034c, context.getContentResolver()), 1, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [buz, java.lang.Object] */
    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        switch (this.f4512b) {
            case 0:
                return this.f4514d.mo3090a();
            default:
                return InputStream.class;
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
        int i = this.f4512b;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        int i = this.f4512b;
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [buz, java.lang.Object] */
    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
        switch (this.f4512b) {
            case 0:
                Object obj = this.f4511a;
                if (obj != null) {
                    try {
                        this.f4514d.mo3092c(obj);
                    } catch (IOException e) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.f4511a;
                if (obj2 != null) {
                    try {
                        ((InputStream) obj2).close();
                    } catch (IOException e2) {
                        return;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e A[Catch: FileNotFoundException -> 0x0105, TryCatch #5 {FileNotFoundException -> 0x0105, blocks: (B:4:0x0005, B:11:0x001d, B:18:0x0039, B:35:0x0056, B:51:0x00b4, B:81:0x00f9, B:82:0x00ff, B:70:0x00e8, B:38:0x005e, B:40:0x0069, B:42:0x0073, B:43:0x0077, B:46:0x0083, B:47:0x00af, B:32:0x0050, B:27:0x0048, B:28:0x004b), top: B:91:0x0005, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0069 A[Catch: FileNotFoundException -> 0x0105, TryCatch #5 {FileNotFoundException -> 0x0105, blocks: (B:4:0x0005, B:11:0x001d, B:18:0x0039, B:35:0x0056, B:51:0x00b4, B:81:0x00f9, B:82:0x00ff, B:70:0x00e8, B:38:0x005e, B:40:0x0069, B:42:0x0073, B:43:0x0077, B:46:0x0083, B:47:0x00af, B:32:0x0050, B:27:0x0048, B:28:0x004b), top: B:91:0x0005, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: FileNotFoundException -> 0x0105, TRY_LEAVE, TryCatch #5 {FileNotFoundException -> 0x0105, blocks: (B:4:0x0005, B:11:0x001d, B:18:0x0039, B:35:0x0056, B:51:0x00b4, B:81:0x00f9, B:82:0x00ff, B:70:0x00e8, B:38:0x005e, B:40:0x0069, B:42:0x0073, B:43:0x0077, B:46:0x0083, B:47:0x00af, B:32:0x0050, B:27:0x0048, B:28:0x004b), top: B:91:0x0005, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9 A[Catch: FileNotFoundException -> 0x0105, TRY_ENTER, TryCatch #5 {FileNotFoundException -> 0x0105, blocks: (B:4:0x0005, B:11:0x001d, B:18:0x0039, B:35:0x0056, B:51:0x00b4, B:81:0x00f9, B:82:0x00ff, B:70:0x00e8, B:38:0x005e, B:40:0x0069, B:42:0x0073, B:43:0x0077, B:46:0x0083, B:47:0x00af, B:32:0x0050, B:27:0x0048, B:28:0x004b), top: B:91:0x0005, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v17, types: [btg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [brt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [buz, java.lang.Object] */
    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) throws Throwable {
        Cursor cursorMo2959a;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iM3285y;
        switch (this.f4512b) {
            case 0:
                try {
                    Object objMo3091b = this.f4514d.mo3091b((File) this.f4513c);
                    this.f4511a = objMo3091b;
                    bqzVar.mo2945b(objMo3091b);
                    return;
                } catch (FileNotFoundException e) {
                    bqzVar.mo2946e(e);
                    return;
                }
            default:
                try {
                    Object obj = this.f4513c;
                    Object obj2 = this.f4514d;
                    Cursor cursor = null;
                    inputStreamOpenInputStream = null;
                    inputStreamOpenInputStream = null;
                    InputStream inputStreamOpenInputStream2 = null;
                    try {
                        cursorMo2959a = ((cvy) obj).f9847d.mo2959a((Uri) obj2);
                        if (cursorMo2959a != null) {
                            try {
                                if (cursorMo2959a.moveToFirst()) {
                                    string = cursorMo2959a.getString(0);
                                    cursorMo2959a.close();
                                }
                            } catch (SecurityException e2) {
                                if (cursorMo2959a == null) {
                                    string = null;
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    file = new File(string);
                                    if (file.exists()) {
                                        inputStreamOpenInputStream = null;
                                    } else {
                                        inputStreamOpenInputStream = null;
                                    }
                                }
                                if (inputStreamOpenInputStream != null) {
                                    Object obj3 = this.f4513c;
                                    try {
                                        inputStreamOpenInputStream2 = ((ContentResolver) ((cvy) obj3).f9846c).openInputStream((Uri) this.f4514d);
                                        try {
                                            iM3285y = bzq.m3285y(((cvy) obj3).f9844a, inputStreamOpenInputStream2, ((cvy) obj3).f9845b);
                                            if (inputStreamOpenInputStream2 != null) {
                                                try {
                                                    inputStreamOpenInputStream2.close();
                                                    break;
                                                } catch (IOException e3) {
                                                }
                                            }
                                        } catch (IOException e4) {
                                            if (inputStreamOpenInputStream2 != null) {
                                                try {
                                                    inputStreamOpenInputStream2.close();
                                                    iM3285y = -1;
                                                } catch (IOException e5) {
                                                    iM3285y = -1;
                                                }
                                            } else {
                                                iM3285y = -1;
                                            }
                                        } catch (NullPointerException e6) {
                                            if (inputStreamOpenInputStream2 != null) {
                                                inputStreamOpenInputStream2.close();
                                                iM3285y = -1;
                                            } else {
                                                iM3285y = -1;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (inputStreamOpenInputStream2 != null) {
                                                try {
                                                    inputStreamOpenInputStream2.close();
                                                    break;
                                                } catch (IOException e7) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e8) {
                                    } catch (NullPointerException e9) {
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } else {
                                    iM3285y = -1;
                                }
                                if (iM3285y != -1) {
                                    inputStreamOpenInputStream = new brg(inputStreamOpenInputStream, iM3285y);
                                }
                                this.f4511a = inputStreamOpenInputStream;
                                bqzVar.mo2945b(inputStreamOpenInputStream);
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = cursorMo2959a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                            if (!TextUtils.isEmpty(string)) {
                                file = new File(string);
                                if (file.exists() || file.length() <= 0) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    Uri uriFromFile = Uri.fromFile(file);
                                    try {
                                        inputStreamOpenInputStream = ((ContentResolver) ((cvy) obj).f9846c).openInputStream(uriFromFile);
                                    } catch (NullPointerException e10) {
                                        throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + String.valueOf(obj2) + " -> " + String.valueOf(uriFromFile)).initCause(e10));
                                    }
                                }
                                break;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                            if (inputStreamOpenInputStream != null) {
                                Object obj4 = this.f4513c;
                                inputStreamOpenInputStream2 = ((ContentResolver) ((cvy) obj4).f9846c).openInputStream((Uri) this.f4514d);
                                iM3285y = bzq.m3285y(((cvy) obj4).f9844a, inputStreamOpenInputStream2, ((cvy) obj4).f9845b);
                                if (inputStreamOpenInputStream2 != null) {
                                    inputStreamOpenInputStream2.close();
                                }
                                break;
                            } else {
                                iM3285y = -1;
                            }
                            if (iM3285y != -1) {
                                inputStreamOpenInputStream = new brg(inputStreamOpenInputStream, iM3285y);
                            }
                            this.f4511a = inputStreamOpenInputStream;
                            bqzVar.mo2945b(inputStreamOpenInputStream);
                            return;
                        }
                        if (cursorMo2959a != null) {
                            cursorMo2959a.close();
                        }
                    } catch (SecurityException e11) {
                        cursorMo2959a = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    string = null;
                    if (!TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        Object obj5 = this.f4513c;
                        inputStreamOpenInputStream2 = ((ContentResolver) ((cvy) obj5).f9846c).openInputStream((Uri) this.f4514d);
                        iM3285y = bzq.m3285y(((cvy) obj5).f9844a, inputStreamOpenInputStream2, ((cvy) obj5).f9845b);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                        break;
                    } else {
                        iM3285y = -1;
                    }
                    if (iM3285y != -1) {
                        inputStreamOpenInputStream = new brg(inputStreamOpenInputStream, iM3285y);
                    }
                    this.f4511a = inputStreamOpenInputStream;
                    bqzVar.mo2945b(inputStreamOpenInputStream);
                    return;
                } catch (FileNotFoundException e12) {
                    bqzVar.mo2946e(e12);
                    return;
                }
        }
    }
}
