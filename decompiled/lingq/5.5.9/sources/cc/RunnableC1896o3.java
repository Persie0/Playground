package cc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.o3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1896o3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final URL f10050a;

    /* JADX INFO: renamed from: b */
    public final byte[] f10051b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1878m3 f10052c;

    /* JADX INFO: renamed from: d */
    public final String f10053d;

    /* JADX INFO: renamed from: e */
    public final Map f10054e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1905p3 f10055f;

    public RunnableC1896o3(C1905p3 c1905p3, String str, URL url, byte[] bArr, Map map, InterfaceC1878m3 interfaceC1878m3) {
        this.f10055f = c1905p3;
        C6272i.m12912f(str);
        this.f10050a = url;
        this.f10051b = bArr;
        this.f10052c = interfaceC1878m3;
        this.f10053d = str;
        this.f10054e = map;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fb A[EDGE_INSN: B:100:0x00fb->B:30:0x00fb BREAK  A[LOOP:1: B:27:0x00ef->B:29:0x00f6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6 A[Catch: all -> 0x0122, LOOP:1: B:27:0x00ef->B:29:0x00f6, LOOP_END, TryCatch #0 {all -> 0x0122, blocks: (B:26:0x00ed, B:27:0x00ef, B:29:0x00f6, B:30:0x00fb), top: B:84:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0130: MOVE (r10 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:42:0x012f */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        IOException iOException;
        int i10;
        Map map;
        Map map2;
        int i11;
        RunnableC1887n3 runnableC1887n3;
        C1879m4 c1879m4;
        int responseCode;
        Map map3;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i12;
        String str = this.f10053d;
        C1905p3 c1905p3 = this.f10055f;
        C1879m4 c1879m5 = ((C1897o4) c1905p3.f10430a).f10087j;
        C1897o4.m5776k(c1879m5);
        c1879m5.m5749l();
        InterfaceC1781b5 interfaceC1781b5 = c1905p3.f10430a;
        OutputStream outputStream2 = null;
        try {
            URLConnection uRLConnectionOpenConnection = this.f10050a.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            ((C1897o4) interfaceC1781b5).getClass();
            httpURLConnection.setConnectTimeout(60000);
            ((C1897o4) interfaceC1781b5).getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map4 = this.f10054e;
                if (map4 != null) {
                    for (Map.Entry entry : map4.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr2 = this.f10051b;
                if (bArr2 != null) {
                    C1864k7 c1864k7 = c1905p3.f10436b.f9897g;
                    C1846i7.m5629H(c1864k7);
                    byte[] bArrM5732J = c1864k7.m5732J(bArr2);
                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k3);
                    C1842i3 c1842i3 = c1860k3.f9938I;
                    int length = bArrM5732J.length;
                    c1842i3.m5624b(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArrM5732J);
                        outputStream.close();
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        bArr = new byte[1024];
                                        while (true) {
                                            i12 = inputStream.read(bArr);
                                            if (i12 > 0) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr, 0, i12);
                                            }
                                        }
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
                                        C1897o4.m5776k(c1879m4);
                                        runnableC1887n3 = new RunnableC1887n3(this.f10053d, this.f10052c, responseCode, null, byteArray, headerFields);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream = null;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                i10 = responseCode;
                                map = null;
                                iOException = e;
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.close();
                                    } catch (IOException e11) {
                                        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                                        C1897o4.m5776k(c1860k4);
                                        c1860k4.f9942f.m5625c(C1860k3.m5700q(str), e11, "Error closing HTTP compressed POST connection output stream. appId");
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
                                        C1897o4.m5776k(c1879m4);
                                        runnableC1887n3 = new RunnableC1887n3(this.f10053d, this.f10052c, i10, iOException, null, map);
                                        c1879m4.m5753p(runnableC1887n3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
                                C1897o4.m5776k(c1879m4);
                                runnableC1887n3 = new RunnableC1887n3(this.f10053d, this.f10052c, i10, iOException, null, map);
                            } catch (Throwable th4) {
                                th = th4;
                                i11 = responseCode;
                                map2 = null;
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.close();
                                    } catch (IOException e12) {
                                        C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                                        C1897o4.m5776k(c1860k5);
                                        c1860k5.f9942f.m5625c(C1860k3.m5700q(str), e12, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                C1879m4 c1879m6 = ((C1897o4) interfaceC1781b5).f10087j;
                                C1897o4.m5776k(c1879m6);
                                c1879m6.m5753p(new RunnableC1887n3(this.f10053d, this.f10052c, i11, null, null, map2));
                                throw th;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            i10 = responseCode;
                            map = null;
                            iOException = e;
                            if (outputStream2 != null) {
                                outputStream2.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
                            C1897o4.m5776k(c1879m4);
                            runnableC1887n3 = new RunnableC1887n3(this.f10053d, this.f10052c, i10, iOException, null, map);
                        } catch (Throwable th5) {
                            th = th5;
                            i11 = responseCode;
                            map2 = map3;
                            if (outputStream2 != null) {
                                outputStream2.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C1879m4 c1879m7 = ((C1897o4) interfaceC1781b5).f10087j;
                            C1897o4.m5776k(c1879m7);
                            c1879m7.m5753p(new RunnableC1887n3(this.f10053d, this.f10052c, i11, null, null, map2));
                            throw th;
                        }
                    } catch (IOException e14) {
                        iOException = e14;
                        i10 = 0;
                        map = null;
                        outputStream2 = outputStream;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
                        C1897o4.m5776k(c1879m4);
                        runnableC1887n3 = new RunnableC1887n3(this.f10053d, this.f10052c, i10, iOException, null, map);
                        c1879m4.m5753p(runnableC1887n3);
                    } catch (Throwable th6) {
                        th = th6;
                        map2 = null;
                        outputStream2 = outputStream;
                        i11 = 0;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        C1879m4 c1879m8 = ((C1897o4) interfaceC1781b5).f10087j;
                        C1897o4.m5776k(c1879m8);
                        c1879m8.m5753p(new RunnableC1887n3(this.f10053d, this.f10052c, i11, null, null, map2));
                        throw th;
                    }
                } else {
                    responseCode = httpURLConnection.getResponseCode();
                    Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream = httpURLConnection.getInputStream();
                    bArr = new byte[1024];
                    while (true) {
                        i12 = inputStream.read(bArr);
                        if (i12 > 0) {
                            break;
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i12);
                    }
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
                    C1897o4.m5776k(c1879m4);
                    runnableC1887n3 = new RunnableC1887n3(this.f10053d, this.f10052c, responseCode, null, byteArray2, headerFields2);
                }
            } catch (IOException e15) {
                iOException = e15;
                i10 = 0;
                map = null;
            } catch (Throwable th7) {
                th = th7;
                outputStream = null;
            }
            c1879m4.m5753p(runnableC1887n3);
        } catch (IOException e16) {
            iOException = e16;
            i10 = 0;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
