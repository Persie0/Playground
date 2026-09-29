package com.lingq.core.download.downloader;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.AbstractC3584sr;
import p000.c32;
import p000.co7;
import p000.dr6;
import p000.i18;
import p000.j88;
import p000.m88;
import p000.mj2;
import p000.nj2;
import p000.oj2;
import p000.un1;
import p000.v33;
import p000.vi3;
import p000.w41;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.download.downloader.FileDownloader$download$3", m4291f = "FileDownloader.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FileDownloader$download$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f20233b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1550a f20234c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ File f20235d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f20236e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f20237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDownloader$download$3(String str, C1550a c1550a, File file, vi3 vi3Var, String str2, Continuation continuation) {
        super(2, continuation);
        this.f20233b = str;
        this.f20234c = c1550a;
        this.f20235d = file;
        this.f20236e = vi3Var;
        this.f20237f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FileDownloader$download$3 fileDownloader$download$3 = new FileDownloader$download$3(this.f20233b, this.f20234c, this.f20235d, this.f20236e, this.f20237f, continuation);
        fileDownloader$download$3.f20232a = obj;
        return fileDownloader$download$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FileDownloader$download$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        mj2 mj2Var;
        String message;
        vi3 vi3Var;
        int i;
        mj2 mj2Var2 = mj2.f51392a;
        File file = this.f20235d;
        un1 un1Var = (un1) this.f20232a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        try {
            try {
                w41 w41Var = new w41(13);
                w41Var.m23718L(this.f20233b);
                String str = this.f20237f;
                if (str != null) {
                    w41Var.m23732u("User-Agent", str);
                }
                co7 co7Var = new co7(w41Var);
                dr6 dr6Var = this.f20234c.f20238a;
                dr6Var.getClass();
                j88 j88VarExecute = FirebasePerfOkHttpClient.execute(new i18(dr6Var, co7Var));
                if (!j88VarExecute.f45200L) {
                    return new nj2("HTTP error: " + j88VarExecute.f45204d);
                }
                m88 m88Var = j88VarExecute.f45207g;
                long jMo3001b = m88Var.mo3001b();
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                try {
                    File file2 = new File(file.getParent(), file.getName() + ".tmp");
                    try {
                        try {
                            InputStream inputStreamMo480f0 = m88Var.mo3003e().mo480f0();
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    try {
                                        byte[] bArr = new byte[8192];
                                        int i2 = -1;
                                        int i3 = -1;
                                        long j = 0;
                                        while (true) {
                                            int i4 = inputStreamMo480f0.read(bArr);
                                            mj2Var = mj2Var2;
                                            vi3Var = this.f20236e;
                                            if (i4 == i2) {
                                                break;
                                            }
                                            try {
                                                AbstractC3208a.m15439f(un1Var.mo1309x());
                                                fileOutputStream.write(bArr, 0, i4);
                                                un1 un1Var2 = un1Var;
                                                long j2 = jMo3001b;
                                                j += (long) i4;
                                                if (j2 > 0 && (i = (int) ((100 * j) / j2)) != i3) {
                                                    vi3Var.invoke(new Integer(i));
                                                    i3 = i;
                                                }
                                                un1Var = un1Var2;
                                                mj2Var2 = mj2Var;
                                                jMo3001b = j2;
                                                i2 = -1;
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable th2 = th;
                                                try {
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    AbstractC3584sr.m21646y(fileOutputStream, th2);
                                                    throw th3;
                                                }
                                            }
                                        }
                                        fileOutputStream.close();
                                        inputStreamMo480f0.close();
                                        if (file2.renameTo(file)) {
                                            vi3Var.invoke(new Integer(100));
                                        } else {
                                            v33.m23077S(file2, file);
                                            file2.delete();
                                            vi3Var.invoke(new Integer(100));
                                        }
                                        return oj2.f54458a;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        Throwable th5 = th;
                                        try {
                                            throw th5;
                                        } catch (Throwable th6) {
                                            AbstractC3584sr.m21646y(inputStreamMo480f0, th5);
                                            throw th6;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    mj2Var = mj2Var2;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                mj2Var = mj2Var2;
                            }
                        } catch (CancellationException unused) {
                            mj2Var = mj2Var2;
                            file2.delete();
                            return mj2Var;
                        } catch (Exception e) {
                            e = e;
                            file2.delete();
                            message = e.getMessage();
                            if (message == null) {
                                message = "Unknown error";
                            }
                            return new nj2(message);
                        }
                    } catch (CancellationException unused2) {
                        file2.delete();
                        return mj2Var;
                    } catch (Exception e2) {
                        e = e2;
                        file2.delete();
                        message = e.getMessage();
                        if (message == null) {
                            message = "Unknown error";
                        }
                        return new nj2(message);
                    }
                } catch (CancellationException unused3) {
                }
            } catch (Exception e3) {
                String message2 = e3.getMessage();
                return new nj2(message2 != null ? message2 : "Unknown error");
            }
        } catch (CancellationException unused4) {
            mj2Var = mj2Var2;
        }
    }
}
