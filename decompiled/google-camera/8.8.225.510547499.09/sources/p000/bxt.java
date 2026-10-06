package p000;

import android.content.res.AssetFileDescriptor;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxt implements bxu {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4723a;

    public bxt(int i) {
        this.f4723a = i;
    }

    /* JADX INFO: renamed from: c */
    private static final MediaDataSource m3174c(ByteBuffer byteBuffer) {
        return new bxs(byteBuffer);
    }

    @Override // p000.bxu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3175a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f4723a) {
            case 0:
                mediaExtractor.setDataSource(m3174c((ByteBuffer) obj));
                break;
            case 1:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // p000.bxu
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3176b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f4723a) {
            case 0:
                mediaMetadataRetriever.setDataSource(m3174c((ByteBuffer) obj));
                break;
            case 1:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }
}
