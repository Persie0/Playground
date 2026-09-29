package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class cyc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final URL f34717a;

    /* JADX INFO: renamed from: b */
    public final byte[] f34718b;

    /* JADX INFO: renamed from: c */
    public final txc f34719c;

    /* JADX INFO: renamed from: d */
    public final String f34720d;

    /* JADX INFO: renamed from: e */
    public final Map f34721e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ fyc f34722f;

    public cyc(fyc fycVar, String str, URL url, byte[] bArr, HashMap map, txc txcVar) {
        Objects.requireNonNull(fycVar);
        this.f34722f = fycVar;
        lda.m16127m(str);
        this.f34717a = url;
        this.f34718b = bArr;
        this.f34719c = txcVar;
        this.f34720d = str;
        this.f34721e = map;
    }

    /* JADX INFO: renamed from: a */
    public final void m9939a(int i, IOException iOException, byte[] bArr, Map map) {
        tic ticVar = ((kjc) this.f34722f.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new RunnableC3626tw(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [cyc] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        ?? r6;
        IOException e;
        ?? r7;
        InputStream inputStream;
        String str = this.f34720d;
        fyc fycVar = this.f34722f;
        kjc kjcVar = (kjc) fycVar.f60774a;
        kjc kjcVar2 = (kjc) fycVar.f60774a;
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22071H();
        int i = 0;
        ?? r4 = 0;
        ?? r8 = 0;
        try {
            URLConnection uRLConnectionOpenConnection = this.f34717a.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            kjcVar2.getClass();
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.f34721e;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] byteArray = this.f34718b;
                    if (byteArray != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(byteArray);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            xcc xccVar = kjcVar2.f47438f;
                            kjc.m15280l(xccVar);
                            occ occVar = xccVar.f68076I;
                            int length = byteArray.length;
                            occVar.m17924b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(byteArray);
                                outputStream.close();
                            } catch (IOException e2) {
                                e = e2;
                                r4 = 0;
                                r7 = outputStream;
                                if (r7 != 0) {
                                    try {
                                        r7.close();
                                    } catch (IOException e3) {
                                        xcc xccVar2 = kjcVar2.f47438f;
                                        kjc.m15280l(xccVar2);
                                        xccVar2.f68080f.m17925c("Error closing HTTP compressed POST connection output stream. appId", xcc.m24449L(str), e3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                m9939a(i, e, null, r4);
                            } catch (Throwable th2) {
                                th = th2;
                                r8 = 0;
                                r6 = outputStream;
                                if (r6 != 0) {
                                    try {
                                        r6.close();
                                    } catch (IOException e4) {
                                        xcc xccVar3 = kjcVar2.f47438f;
                                        kjc.m15280l(xccVar3);
                                        xccVar3.f68080f.m17925c("Error closing HTTP compressed POST connection output stream. appId", xcc.m24449L(str), e4);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                m9939a(i, null, null, r8);
                                throw th;
                            }
                        } catch (IOException e5) {
                            xcc xccVar4 = kjcVar2.f47438f;
                            kjc.m15280l(xccVar4);
                            xccVar4.f68080f.m17924b(e5, "Failed to gzip post request content");
                            throw e5;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i2 = inputStream.read(bArr);
                                        if (i2 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            m9939a(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, i2);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = null;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            i = responseCode;
                            r7 = r4;
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m9939a(i, e, null, r4);
                        } catch (Throwable th5) {
                            th = th5;
                            i = responseCode;
                            r6 = r4;
                            if (r6 != 0) {
                                r6.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m9939a(i, null, null, r8);
                            throw th;
                        }
                    } catch (IOException e7) {
                        r4 = byteArray;
                        e = e7;
                        i = responseCode;
                        r7 = 0;
                        if (r7 != 0) {
                            r7.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m9939a(i, e, null, r4);
                    } catch (Throwable th6) {
                        r8 = byteArray;
                        th = th6;
                        i = responseCode;
                        r6 = 0;
                        if (r6 != 0) {
                            r6.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m9939a(i, null, null, r8);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (IOException e9) {
            e = e9;
            httpURLConnection = null;
            r7 = 0;
            r4 = 0;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            r6 = 0;
            r8 = 0;
        }
    }
}
