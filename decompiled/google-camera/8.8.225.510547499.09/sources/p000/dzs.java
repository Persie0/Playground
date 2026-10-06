package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzs implements dzr {

    /* JADX INFO: renamed from: a */
    private final dzn f13001a;

    /* JADX INFO: renamed from: b */
    private final dzt f13002b;

    public dzs(dzn dznVar, dzt dztVar) {
        this.f13001a = dznVar;
        this.f13002b = dztVar;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0089 A[Catch: all -> 0x01e6, TRY_LEAVE, TryCatch #5 {all -> 0x01e6, blocks: (B:12:0x002c, B:24:0x0079, B:30:0x0083, B:32:0x0089, B:35:0x00a8, B:38:0x00c0, B:40:0x00c8, B:43:0x00cf, B:45:0x00e9, B:46:0x00f5, B:48:0x0108, B:51:0x0115, B:53:0x0130, B:55:0x013e, B:57:0x0144, B:76:0x0181, B:77:0x0185, B:83:0x01a5, B:80:0x019c, B:61:0x0151, B:63:0x015a, B:70:0x0167, B:69:0x0164, B:72:0x0169, B:74:0x0175, B:89:0x01be, B:90:0x01c5, B:99:0x01e5, B:96:0x01ce, B:14:0x0058, B:17:0x005f, B:19:0x0066, B:22:0x0072, B:23:0x0077, B:26:0x007d), top: B:111:0x002c, inners: #4, #8, #12 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[Catch: all -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01e6, blocks: (B:12:0x002c, B:24:0x0079, B:30:0x0083, B:32:0x0089, B:35:0x00a8, B:38:0x00c0, B:40:0x00c8, B:43:0x00cf, B:45:0x00e9, B:46:0x00f5, B:48:0x0108, B:51:0x0115, B:53:0x0130, B:55:0x013e, B:57:0x0144, B:76:0x0181, B:77:0x0185, B:83:0x01a5, B:80:0x019c, B:61:0x0151, B:63:0x015a, B:70:0x0167, B:69:0x0164, B:72:0x0169, B:74:0x0175, B:89:0x01be, B:90:0x01c5, B:99:0x01e5, B:96:0x01ce, B:14:0x0058, B:17:0x005f, B:19:0x0066, B:22:0x0072, B:23:0x0077, B:26:0x007d), top: B:111:0x002c, inners: #4, #8, #12 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0 A[Catch: all -> 0x01e6, TRY_ENTER, TryCatch #5 {all -> 0x01e6, blocks: (B:12:0x002c, B:24:0x0079, B:30:0x0083, B:32:0x0089, B:35:0x00a8, B:38:0x00c0, B:40:0x00c8, B:43:0x00cf, B:45:0x00e9, B:46:0x00f5, B:48:0x0108, B:51:0x0115, B:53:0x0130, B:55:0x013e, B:57:0x0144, B:76:0x0181, B:77:0x0185, B:83:0x01a5, B:80:0x019c, B:61:0x0151, B:63:0x015a, B:70:0x0167, B:69:0x0164, B:72:0x0169, B:74:0x0175, B:89:0x01be, B:90:0x01c5, B:99:0x01e5, B:96:0x01ce, B:14:0x0058, B:17:0x005f, B:19:0x0066, B:22:0x0072, B:23:0x0077, B:26:0x007d), top: B:111:0x002c, inners: #4, #8, #12 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0108 A[Catch: all -> 0x01e6, TryCatch #5 {all -> 0x01e6, blocks: (B:12:0x002c, B:24:0x0079, B:30:0x0083, B:32:0x0089, B:35:0x00a8, B:38:0x00c0, B:40:0x00c8, B:43:0x00cf, B:45:0x00e9, B:46:0x00f5, B:48:0x0108, B:51:0x0115, B:53:0x0130, B:55:0x013e, B:57:0x0144, B:76:0x0181, B:77:0x0185, B:83:0x01a5, B:80:0x019c, B:61:0x0151, B:63:0x015a, B:70:0x0167, B:69:0x0164, B:72:0x0169, B:74:0x0175, B:89:0x01be, B:90:0x01c5, B:99:0x01e5, B:96:0x01ce, B:14:0x0058, B:17:0x005f, B:19:0x0066, B:22:0x0072, B:23:0x0077, B:26:0x007d), top: B:111:0x002c, inners: #4, #8, #12 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0130 A[Catch: all -> 0x01e6, TRY_ENTER, TryCatch #5 {all -> 0x01e6, blocks: (B:12:0x002c, B:24:0x0079, B:30:0x0083, B:32:0x0089, B:35:0x00a8, B:38:0x00c0, B:40:0x00c8, B:43:0x00cf, B:45:0x00e9, B:46:0x00f5, B:48:0x0108, B:51:0x0115, B:53:0x0130, B:55:0x013e, B:57:0x0144, B:76:0x0181, B:77:0x0185, B:83:0x01a5, B:80:0x019c, B:61:0x0151, B:63:0x015a, B:70:0x0167, B:69:0x0164, B:72:0x0169, B:74:0x0175, B:89:0x01be, B:90:0x01c5, B:99:0x01e5, B:96:0x01ce, B:14:0x0058, B:17:0x005f, B:19:0x0066, B:22:0x0072, B:23:0x0077, B:26:0x007d), top: B:111:0x002c, inners: #4, #8, #12 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x013e A[Catch: all -> 0x01e6, TRY_LEAVE, TryCatch #5 {all -> 0x01e6, blocks: (B:12:0x002c, B:24:0x0079, B:30:0x0083, B:32:0x0089, B:35:0x00a8, B:38:0x00c0, B:40:0x00c8, B:43:0x00cf, B:45:0x00e9, B:46:0x00f5, B:48:0x0108, B:51:0x0115, B:53:0x0130, B:55:0x013e, B:57:0x0144, B:76:0x0181, B:77:0x0185, B:83:0x01a5, B:80:0x019c, B:61:0x0151, B:63:0x015a, B:70:0x0167, B:69:0x0164, B:72:0x0169, B:74:0x0175, B:89:0x01be, B:90:0x01c5, B:99:0x01e5, B:96:0x01ce, B:14:0x0058, B:17:0x005f, B:19:0x0066, B:22:0x0072, B:23:0x0077, B:26:0x007d), top: B:111:0x002c, inners: #4, #8, #12 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0144 A[Catch: all -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01e6, blocks: (B:12:0x002c, B:24:0x0079, B:30:0x0083, B:32:0x0089, B:35:0x00a8, B:38:0x00c0, B:40:0x00c8, B:43:0x00cf, B:45:0x00e9, B:46:0x00f5, B:48:0x0108, B:51:0x0115, B:53:0x0130, B:55:0x013e, B:57:0x0144, B:76:0x0181, B:77:0x0185, B:83:0x01a5, B:80:0x019c, B:61:0x0151, B:63:0x015a, B:70:0x0167, B:69:0x0164, B:72:0x0169, B:74:0x0175, B:89:0x01be, B:90:0x01c5, B:99:0x01e5, B:96:0x01ce, B:14:0x0058, B:17:0x005f, B:19:0x0066, B:22:0x0072, B:23:0x0077, B:26:0x007d), top: B:111:0x002c, inners: #4, #8, #12 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0181 A[Catch: all -> 0x01e6, TRY_LEAVE, TryCatch #5 {all -> 0x01e6, blocks: (B:12:0x002c, B:24:0x0079, B:30:0x0083, B:32:0x0089, B:35:0x00a8, B:38:0x00c0, B:40:0x00c8, B:43:0x00cf, B:45:0x00e9, B:46:0x00f5, B:48:0x0108, B:51:0x0115, B:53:0x0130, B:55:0x013e, B:57:0x0144, B:76:0x0181, B:77:0x0185, B:83:0x01a5, B:80:0x019c, B:61:0x0151, B:63:0x015a, B:70:0x0167, B:69:0x0164, B:72:0x0169, B:74:0x0175, B:89:0x01be, B:90:0x01c5, B:99:0x01e5, B:96:0x01ce, B:14:0x0058, B:17:0x005f, B:19:0x0066, B:22:0x0072, B:23:0x0077, B:26:0x007d), top: B:111:0x002c, inners: #4, #8, #12 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019b  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c A[Catch: bfc -> 0x01a4, all -> 0x01e6, TRY_LEAVE, TryCatch #5 {all -> 0x01e6, blocks: (B:12:0x002c, B:24:0x0079, B:30:0x0083, B:32:0x0089, B:35:0x00a8, B:38:0x00c0, B:40:0x00c8, B:43:0x00cf, B:45:0x00e9, B:46:0x00f5, B:48:0x0108, B:51:0x0115, B:53:0x0130, B:55:0x013e, B:57:0x0144, B:76:0x0181, B:77:0x0185, B:83:0x01a5, B:80:0x019c, B:61:0x0151, B:63:0x015a, B:70:0x0167, B:69:0x0164, B:72:0x0169, B:74:0x0175, B:89:0x01be, B:90:0x01c5, B:99:0x01e5, B:96:0x01ce, B:14:0x0058, B:17:0x005f, B:19:0x0066, B:22:0x0072, B:23:0x0077, B:26:0x007d), top: B:111:0x002c, inners: #4, #8, #12 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b3  */
    @Override // p000.dzr
    /* JADX INFO: renamed from: a */
    public final mrm mo6972a(long j) {
        mrm mrmVar;
        mrm mrmVarM16829i;
        String str;
        String lowerCase;
        String canonicalPath;
        String str2;
        bfd bfdVarM14805k;
        FileInputStream fileInputStream;
        mrm mrmVarM6965b;
        kbz kbzVar;
        bgg bggVarMo2290a;
        dzn dznVar = this.f13001a;
        try {
            mrmVar = (mrm) nod.m17553i(dznVar.f12995b, new dzl(j), dznVar.f12997d).get();
        } catch (InterruptedException | ExecutionException e) {
            mrmVar = mqu.f41450a;
        }
        if (!mrmVar.mo16813g()) {
            dzt dztVar = this.f13002b;
            dztVar.f13005c.mo13961e("SpecialType");
            try {
                Uri uriBuild = MediaStore.Files.getContentUri("external").buildUpon().appendPath(Long.toString(j)).build();
                uriBuild.getClass();
                Cursor cursorQuery = dztVar.f13004b.query(uriBuild, new String[]{"_data"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(0);
                            mrmVarM16829i = (string == null || !new File(string).exists()) ? mqu.f41450a : mrm.m16829i(string);
                        } else {
                            mrmVarM16829i = mqu.f41450a;
                            if (cursorQuery != null) {
                            }
                            if (mrmVarM16829i.mo16813g()) {
                                str = (String) mrmVarM16829i.mo16809c();
                                lowerCase = str.toLowerCase(Locale.getDefault());
                                if (!lowerCase.endsWith("jpg") || lowerCase.endsWith("jpeg") || lowerCase.endsWith("dng")) {
                                    try {
                                        canonicalPath = new File(str).getCanonicalPath();
                                        canonicalPath.getClass();
                                        dhv dhvVar = dztVar.f13006d;
                                        dhx dhxVar = dib.f11240a;
                                        dhvVar.mo6177e();
                                        if (canonicalPath.startsWith(dztVar.f13007e.m10453b()) && !str.startsWith(dztVar.f13008f.m10453b())) {
                                            ((nbe) ((nbe) dzt.f13003a.m17252c()).mo17276G(1220)).mo17293r("Ignoring metadata for image that is not in supported location: %s", str);
                                            mrmVarM6965b = mqu.f41450a;
                                            kbzVar = dztVar.f13005c;
                                        } else if (str.toLowerCase(Locale.getDefault()).endsWith("dng")) {
                                            mrmVarM6965b = mqu.f41450a;
                                            kbzVar = dztVar.f13005c;
                                        } else {
                                            boolean z = dztVar.f13009g.f38949a;
                                            str2 = null;
                                            if (ksh.m14802h(str)) {
                                                try {
                                                    fileInputStream = new FileInputStream(str);
                                                    try {
                                                        bfdVarM14805k = ksh.m14805k(fileInputStream);
                                                        fileInputStream.close();
                                                    } catch (Throwable th) {
                                                        try {
                                                            fileInputStream.close();
                                                        } catch (Throwable th2) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                        }
                                                        throw th;
                                                    }
                                                } catch (FileNotFoundException e2) {
                                                    Log.e("XmpUtil", "Could not find file: ".concat(str), e2);
                                                    bfdVarM14805k = null;
                                                } catch (IOException e3) {
                                                    Log.e("XmpUtil", "Could not read file: ".concat(str), e3);
                                                    bfdVarM14805k = null;
                                                }
                                            } else {
                                                bfdVarM14805k = null;
                                            }
                                            if (bfdVarM14805k == null) {
                                                bfdVarM14805k = bff.m2301a();
                                            }
                                            try {
                                                C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
                                                C0168et.m7839h("SpecialTypeID");
                                                bggVarMo2290a = ((bfr) bfdVarM14805k).mo2290a("http://ns.google.com/photos/1.0/camera/", bdy.m2259b("SpecialTypeID", 1));
                                                if (bggVarMo2290a != null) {
                                                    str2 = (String) ((bfq) bggVarMo2290a).f3125a;
                                                }
                                            } catch (bfc e4) {
                                            }
                                            mrmVarM6965b = dzk.m6965b(str2);
                                            kbzVar = dztVar.f13005c;
                                        }
                                    } catch (IOException e5) {
                                        throw new IllegalStateException("Fails to obtain canonical path", e5);
                                    }
                                } else {
                                    ((nbe) ((nbe) dzt.f13003a.m17252c()).mo17276G(1221)).mo17293r("Ignoring metadata for file which is not an image %s", str);
                                    mrmVarM6965b = mqu.f41450a;
                                    kbzVar = dztVar.f13005c;
                                }
                            } else {
                                ((nbe) ((nbe) dzt.f13003a.m17252c()).mo17276G(1222)).mo17292q("No metadata for %d", j);
                                mrmVarM6965b = mqu.f41450a;
                                kbzVar = dztVar.f13005c;
                            }
                            kbzVar.mo13962f();
                            mrmVar = mrmVarM6965b;
                            if (mrmVar.mo16813g()) {
                                mo6973b(j, (dzk) mrmVar.mo16809c());
                            }
                        }
                        cursorQuery.close();
                        if (mrmVarM16829i.mo16813g()) {
                            ((nbe) ((nbe) dzt.f13003a.m17252c()).mo17276G(1222)).mo17292q("No metadata for %d", j);
                            mrmVarM6965b = mqu.f41450a;
                            kbzVar = dztVar.f13005c;
                        } else {
                            str = (String) mrmVarM16829i.mo16809c();
                            lowerCase = str.toLowerCase(Locale.getDefault());
                            if (lowerCase.endsWith("jpg")) {
                                canonicalPath = new File(str).getCanonicalPath();
                                canonicalPath.getClass();
                                dhv dhvVar2 = dztVar.f13006d;
                                dhx dhxVar2 = dib.f11240a;
                                dhvVar2.mo6177e();
                                if (canonicalPath.startsWith(dztVar.f13007e.m10453b())) {
                                    if (str.toLowerCase(Locale.getDefault()).endsWith("dng")) {
                                        mrmVarM6965b = mqu.f41450a;
                                        kbzVar = dztVar.f13005c;
                                    } else {
                                        boolean z2 = dztVar.f13009g.f38949a;
                                        str2 = null;
                                        if (ksh.m14802h(str)) {
                                            bfdVarM14805k = null;
                                        } else {
                                            fileInputStream = new FileInputStream(str);
                                            bfdVarM14805k = ksh.m14805k(fileInputStream);
                                            fileInputStream.close();
                                        }
                                        if (bfdVarM14805k == null) {
                                            bfdVarM14805k = bff.m2301a();
                                        }
                                        C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
                                        C0168et.m7839h("SpecialTypeID");
                                        bggVarMo2290a = ((bfr) bfdVarM14805k).mo2290a("http://ns.google.com/photos/1.0/camera/", bdy.m2259b("SpecialTypeID", 1));
                                        if (bggVarMo2290a != null) {
                                            str2 = (String) ((bfq) bggVarMo2290a).f3125a;
                                        }
                                        mrmVarM6965b = dzk.m6965b(str2);
                                        kbzVar = dztVar.f13005c;
                                    }
                                } else if (str.toLowerCase(Locale.getDefault()).endsWith("dng")) {
                                    mrmVarM6965b = mqu.f41450a;
                                    kbzVar = dztVar.f13005c;
                                } else {
                                    boolean z3 = dztVar.f13009g.f38949a;
                                    str2 = null;
                                    if (ksh.m14802h(str)) {
                                        bfdVarM14805k = null;
                                    } else {
                                        fileInputStream = new FileInputStream(str);
                                        bfdVarM14805k = ksh.m14805k(fileInputStream);
                                        fileInputStream.close();
                                    }
                                    if (bfdVarM14805k == null) {
                                        bfdVarM14805k = bff.m2301a();
                                    }
                                    C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
                                    C0168et.m7839h("SpecialTypeID");
                                    bggVarMo2290a = ((bfr) bfdVarM14805k).mo2290a("http://ns.google.com/photos/1.0/camera/", bdy.m2259b("SpecialTypeID", 1));
                                    if (bggVarMo2290a != null) {
                                        str2 = (String) ((bfq) bggVarMo2290a).f3125a;
                                    }
                                    mrmVarM6965b = dzk.m6965b(str2);
                                    kbzVar = dztVar.f13005c;
                                }
                            } else {
                                canonicalPath = new File(str).getCanonicalPath();
                                canonicalPath.getClass();
                                dhv dhvVar3 = dztVar.f13006d;
                                dhx dhxVar3 = dib.f11240a;
                                dhvVar3.mo6177e();
                                if (canonicalPath.startsWith(dztVar.f13007e.m10453b())) {
                                    if (str.toLowerCase(Locale.getDefault()).endsWith("dng")) {
                                        mrmVarM6965b = mqu.f41450a;
                                        kbzVar = dztVar.f13005c;
                                    } else {
                                        boolean z4 = dztVar.f13009g.f38949a;
                                        str2 = null;
                                        if (ksh.m14802h(str)) {
                                            bfdVarM14805k = null;
                                        } else {
                                            fileInputStream = new FileInputStream(str);
                                            bfdVarM14805k = ksh.m14805k(fileInputStream);
                                            fileInputStream.close();
                                        }
                                        if (bfdVarM14805k == null) {
                                            bfdVarM14805k = bff.m2301a();
                                        }
                                        C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
                                        C0168et.m7839h("SpecialTypeID");
                                        bggVarMo2290a = ((bfr) bfdVarM14805k).mo2290a("http://ns.google.com/photos/1.0/camera/", bdy.m2259b("SpecialTypeID", 1));
                                        if (bggVarMo2290a != null) {
                                            str2 = (String) ((bfq) bggVarMo2290a).f3125a;
                                        }
                                        mrmVarM6965b = dzk.m6965b(str2);
                                        kbzVar = dztVar.f13005c;
                                    }
                                } else if (str.toLowerCase(Locale.getDefault()).endsWith("dng")) {
                                    mrmVarM6965b = mqu.f41450a;
                                    kbzVar = dztVar.f13005c;
                                } else {
                                    boolean z5 = dztVar.f13009g.f38949a;
                                    str2 = null;
                                    if (ksh.m14802h(str)) {
                                        bfdVarM14805k = null;
                                    } else {
                                        fileInputStream = new FileInputStream(str);
                                        bfdVarM14805k = ksh.m14805k(fileInputStream);
                                        fileInputStream.close();
                                    }
                                    if (bfdVarM14805k == null) {
                                        bfdVarM14805k = bff.m2301a();
                                    }
                                    C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
                                    C0168et.m7839h("SpecialTypeID");
                                    bggVarMo2290a = ((bfr) bfdVarM14805k).mo2290a("http://ns.google.com/photos/1.0/camera/", bdy.m2259b("SpecialTypeID", 1));
                                    if (bggVarMo2290a != null) {
                                        str2 = (String) ((bfq) bggVarMo2290a).f3125a;
                                    }
                                    mrmVarM6965b = dzk.m6965b(str2);
                                    kbzVar = dztVar.f13005c;
                                }
                            }
                        }
                        kbzVar.mo13962f();
                        mrmVar = mrmVarM6965b;
                        if (mrmVar.mo16813g()) {
                            mo6973b(j, (dzk) mrmVar.mo16809c());
                        }
                    } catch (Throwable th3) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th4) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                } catch (Exception e6) {
                                }
                            }
                        }
                        throw th3;
                    }
                } else {
                    mrmVarM16829i = mqu.f41450a;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (mrmVarM16829i.mo16813g()) {
                        ((nbe) ((nbe) dzt.f13003a.m17252c()).mo17276G(1222)).mo17292q("No metadata for %d", j);
                        mrmVarM6965b = mqu.f41450a;
                        kbzVar = dztVar.f13005c;
                    } else {
                        str = (String) mrmVarM16829i.mo16809c();
                        lowerCase = str.toLowerCase(Locale.getDefault());
                        if (lowerCase.endsWith("jpg")) {
                            canonicalPath = new File(str).getCanonicalPath();
                            canonicalPath.getClass();
                            dhv dhvVar4 = dztVar.f13006d;
                            dhx dhxVar4 = dib.f11240a;
                            dhvVar4.mo6177e();
                            if (canonicalPath.startsWith(dztVar.f13007e.m10453b())) {
                                if (str.toLowerCase(Locale.getDefault()).endsWith("dng")) {
                                    mrmVarM6965b = mqu.f41450a;
                                    kbzVar = dztVar.f13005c;
                                } else {
                                    boolean z6 = dztVar.f13009g.f38949a;
                                    str2 = null;
                                    if (ksh.m14802h(str)) {
                                        bfdVarM14805k = null;
                                    } else {
                                        fileInputStream = new FileInputStream(str);
                                        bfdVarM14805k = ksh.m14805k(fileInputStream);
                                        fileInputStream.close();
                                    }
                                    if (bfdVarM14805k == null) {
                                        bfdVarM14805k = bff.m2301a();
                                    }
                                    C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
                                    C0168et.m7839h("SpecialTypeID");
                                    bggVarMo2290a = ((bfr) bfdVarM14805k).mo2290a("http://ns.google.com/photos/1.0/camera/", bdy.m2259b("SpecialTypeID", 1));
                                    if (bggVarMo2290a != null) {
                                        str2 = (String) ((bfq) bggVarMo2290a).f3125a;
                                    }
                                    mrmVarM6965b = dzk.m6965b(str2);
                                    kbzVar = dztVar.f13005c;
                                }
                            } else if (str.toLowerCase(Locale.getDefault()).endsWith("dng")) {
                                mrmVarM6965b = mqu.f41450a;
                                kbzVar = dztVar.f13005c;
                            } else {
                                boolean z7 = dztVar.f13009g.f38949a;
                                str2 = null;
                                if (ksh.m14802h(str)) {
                                    bfdVarM14805k = null;
                                } else {
                                    fileInputStream = new FileInputStream(str);
                                    bfdVarM14805k = ksh.m14805k(fileInputStream);
                                    fileInputStream.close();
                                }
                                if (bfdVarM14805k == null) {
                                    bfdVarM14805k = bff.m2301a();
                                }
                                C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
                                C0168et.m7839h("SpecialTypeID");
                                bggVarMo2290a = ((bfr) bfdVarM14805k).mo2290a("http://ns.google.com/photos/1.0/camera/", bdy.m2259b("SpecialTypeID", 1));
                                if (bggVarMo2290a != null) {
                                    str2 = (String) ((bfq) bggVarMo2290a).f3125a;
                                }
                                mrmVarM6965b = dzk.m6965b(str2);
                                kbzVar = dztVar.f13005c;
                            }
                        } else {
                            canonicalPath = new File(str).getCanonicalPath();
                            canonicalPath.getClass();
                            dhv dhvVar5 = dztVar.f13006d;
                            dhx dhxVar5 = dib.f11240a;
                            dhvVar5.mo6177e();
                            if (canonicalPath.startsWith(dztVar.f13007e.m10453b())) {
                                if (str.toLowerCase(Locale.getDefault()).endsWith("dng")) {
                                    mrmVarM6965b = mqu.f41450a;
                                    kbzVar = dztVar.f13005c;
                                } else {
                                    boolean z8 = dztVar.f13009g.f38949a;
                                    str2 = null;
                                    if (ksh.m14802h(str)) {
                                        bfdVarM14805k = null;
                                    } else {
                                        fileInputStream = new FileInputStream(str);
                                        bfdVarM14805k = ksh.m14805k(fileInputStream);
                                        fileInputStream.close();
                                    }
                                    if (bfdVarM14805k == null) {
                                        bfdVarM14805k = bff.m2301a();
                                    }
                                    C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
                                    C0168et.m7839h("SpecialTypeID");
                                    bggVarMo2290a = ((bfr) bfdVarM14805k).mo2290a("http://ns.google.com/photos/1.0/camera/", bdy.m2259b("SpecialTypeID", 1));
                                    if (bggVarMo2290a != null) {
                                        str2 = (String) ((bfq) bggVarMo2290a).f3125a;
                                    }
                                    mrmVarM6965b = dzk.m6965b(str2);
                                    kbzVar = dztVar.f13005c;
                                }
                            } else if (str.toLowerCase(Locale.getDefault()).endsWith("dng")) {
                                mrmVarM6965b = mqu.f41450a;
                                kbzVar = dztVar.f13005c;
                            } else {
                                boolean z9 = dztVar.f13009g.f38949a;
                                str2 = null;
                                if (ksh.m14802h(str)) {
                                    bfdVarM14805k = null;
                                } else {
                                    fileInputStream = new FileInputStream(str);
                                    bfdVarM14805k = ksh.m14805k(fileInputStream);
                                    fileInputStream.close();
                                }
                                if (bfdVarM14805k == null) {
                                    bfdVarM14805k = bff.m2301a();
                                }
                                C0168et.m7842k("http://ns.google.com/photos/1.0/camera/");
                                C0168et.m7839h("SpecialTypeID");
                                bggVarMo2290a = ((bfr) bfdVarM14805k).mo2290a("http://ns.google.com/photos/1.0/camera/", bdy.m2259b("SpecialTypeID", 1));
                                if (bggVarMo2290a != null) {
                                    str2 = (String) ((bfq) bggVarMo2290a).f3125a;
                                }
                                mrmVarM6965b = dzk.m6965b(str2);
                                kbzVar = dztVar.f13005c;
                            }
                        }
                    }
                    kbzVar.mo13962f();
                    mrmVar = mrmVarM6965b;
                    if (mrmVar.mo16813g()) {
                        mo6973b(j, (dzk) mrmVar.mo16809c());
                    }
                }
            } catch (Throwable th5) {
                dztVar.f13005c.mo13962f();
                throw th5;
            }
        }
        if (mrmVar.mo16813g()) {
            mrmVar.mo16809c();
        }
        return mrmVar;
    }

    @Override // p000.dzr
    /* JADX INFO: renamed from: b */
    public final void mo6973b(long j, dzk dzkVar) {
        dzn dznVar = this.f13001a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_store_id", Long.valueOf(j));
        contentValues.put("special_type_id", dzkVar.m6969d());
        nod.m17553i(dznVar.f12996c, new dzm(contentValues, 0), dznVar.f12997d);
    }

    @Override // p000.dzr
    /* JADX INFO: renamed from: c */
    public final void mo6974c(kqc kqcVar, dzk dzkVar) {
        kqcVar.mo14689i();
        String lastPathSegment = kqcVar.mo14682b().getLastPathSegment();
        lastPathSegment.getClass();
        mo6973b(Long.parseLong(lastPathSegment), dzkVar);
    }
}
