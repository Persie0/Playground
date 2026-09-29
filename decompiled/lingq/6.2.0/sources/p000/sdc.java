package p000;

import com.google.android.gms.measurement.internal.C1045d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sdc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final URL f60723a;

    /* JADX INFO: renamed from: b */
    public final byte[] f60724b;

    /* JADX INFO: renamed from: c */
    public final idc f60725c;

    /* JADX INFO: renamed from: d */
    public final String f60726d;

    /* JADX INFO: renamed from: e */
    public final Map f60727e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ydc f60728f;

    public sdc(ydc ydcVar, String str, URL url, byte[] bArr, Map map, idc idcVar) {
        Objects.requireNonNull(ydcVar);
        this.f60728f = ydcVar;
        lda.m16127m(str);
        lda.m16130p(url);
        this.f60723a = url;
        this.f60724b = bArr;
        this.f60725c = idcVar;
        this.f60726d = str;
        this.f60727e = map;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172  */
    /* JADX WARN: Code duplicated, block: B:86:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0102: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:51:0x0100 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0105: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:52:0x0104 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        String str = this.f60726d;
        ydc ydcVar = this.f60728f;
        kjc kjcVar = (kjc) ydcVar.f60774a;
        kjc kjcVar2 = (kjc) ydcVar.f60774a;
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22071H();
        int i = 0;
        OutputStream outputStream = null;
        try {
            URLConnection uRLConnectionOpenConnection = this.f60723a.openConnection();
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
                Map map5 = this.f60727e;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.f60724b;
                if (bArr != null) {
                    dad dadVar = ydcVar.f55716b.f12367g;
                    C1045d.m5885T(dadVar);
                    byte[] bArrM10256n0 = dadVar.m10256n0(bArr);
                    xcc xccVar = kjcVar2.f47438f;
                    kjc.m15280l(xccVar);
                    occ occVar = xccVar.f68076I;
                    int length = bArrM10256n0.length;
                    occVar.m17924b(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrM10256n0);
                        outputStream2.close();
                    } catch (IOException e) {
                        iOException = e;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e2) {
                                xcc xccVar2 = kjcVar2.f47438f;
                                kjc.m15280l(xccVar2);
                                xccVar2.f68080f.m17925c("Error closing HTTP compressed POST connection output stream. appId", xcc.m24449L(str), e2);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        tic ticVar2 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar2);
                        ticVar2.m22076M(new jcc(this.f60726d, this.f60725c, responseCode, iOException, (byte[]) null, map2));
                    } catch (Throwable th2) {
                        th = th2;
                        map = null;
                        outputStream = outputStream2;
                        th = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                xcc xccVar3 = kjcVar2.f47438f;
                                kjc.m15280l(xccVar3);
                                xccVar3.f68080f.m17925c("Error closing HTTP compressed POST connection output stream. appId", xcc.m24449L(str), e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        tic ticVar3 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar3);
                        ticVar3.m22076M(new jcc(this.f60726d, this.f60725c, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i2 = inputStream.read(bArr2);
                                    if (i2 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        tic ticVar4 = kjcVar2.f47439g;
                                        kjc.m15280l(ticVar4);
                                        ticVar4.m22076M(new jcc(this.f60726d, this.f60725c, responseCode, (IOException) null, byteArray, headerFields));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i2);
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
                    } catch (IOException e4) {
                        e = e4;
                        map2 = map4;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        tic ticVar5 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar5);
                        ticVar5.m22076M(new jcc(this.f60726d, this.f60725c, responseCode, iOException, (byte[]) null, map2));
                    } catch (Throwable th5) {
                        th = th5;
                        i = responseCode;
                        map = map3;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        tic ticVar6 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar6);
                        ticVar6.m22076M(new jcc(this.f60726d, this.f60725c, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    map2 = null;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    tic ticVar7 = kjcVar2.f47439g;
                    kjc.m15280l(ticVar7);
                    ticVar7.m22076M(new jcc(this.f60726d, this.f60725c, responseCode, iOException, (byte[]) null, map2));
                } catch (Throwable th6) {
                    th = th6;
                    map = null;
                    i = responseCode;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    tic ticVar8 = kjcVar2.f47439g;
                    kjc.m15280l(ticVar8);
                    ticVar8.m22076M(new jcc(this.f60726d, this.f60725c, i, (IOException) null, (byte[]) null, map));
                    throw th;
                }
            } catch (IOException e6) {
                iOException = e6;
                responseCode = 0;
                map2 = null;
            } catch (Throwable th7) {
                th = th7;
                map = null;
            }
        } catch (IOException e7) {
            iOException = e7;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map = null;
        }
    }
}
