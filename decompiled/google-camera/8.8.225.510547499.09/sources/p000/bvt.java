package p000;

import com.google.android.material.snackbar.VMX.rgoX;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvt implements bra {

    /* JADX INFO: renamed from: a */
    private final Object f4557a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4558b;

    public bvt(File file, int i) {
        this.f4558b = i;
        this.f4557a = file;
    }

    public bvt(Object obj, int i) {
        this.f4558b = i;
        this.f4557a = obj;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        switch (this.f4558b) {
            case 0:
                return this.f4557a.getClass();
            default:
                return ByteBuffer.class;
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
        int i = this.f4558b;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
        int i = this.f4558b;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) throws Throwable {
        RandomAccessFile randomAccessFile;
        switch (this.f4558b) {
            case 0:
                bqzVar.mo2945b(this.f4557a);
                return;
            default:
                try {
                    Object obj = this.f4557a;
                    int i = cav.f4932a;
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
                    try {
                        long length = ((File) obj).length();
                        if (length > 2147483647L) {
                            throw new IOException("File too large to map into memory");
                        }
                        if (length == 0) {
                            throw new IOException(rgoX.svU);
                        }
                        randomAccessFile = new RandomAccessFile((File) obj, "r");
                        try {
                            fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                            MappedByteBuffer mappedByteBufferLoad = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                try {
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                    break;
                                } catch (IOException e) {
                                }
                            }
                            try {
                                randomAccessFile.close();
                                break;
                            } catch (IOException e2) {
                            }
                            bqzVar.mo2945b(mappedByteBufferLoad);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                try {
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                    break;
                                } catch (IOException e3) {
                                }
                            }
                            if (randomAccessFile == null) {
                                throw th;
                            }
                            try {
                                randomAccessFile.close();
                                throw th;
                            } catch (IOException e4) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = null;
                    }
                } catch (IOException e5) {
                    bqzVar.mo2946e(e5);
                    return;
                }
                break;
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        int i = this.f4558b;
        return 1;
    }
}
