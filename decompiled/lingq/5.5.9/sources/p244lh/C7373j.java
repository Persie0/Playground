package p244lh;

import cm.InterfaceC2052l;
import com.lingq.commons.controllers.TtsControllerImpl;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Request;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2core.Reason;
import dm.C5207g;
import java.io.File;
import p122fl.InterfaceC5581d;
import sl.C9072e;

/* JADX INFO: renamed from: lh.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7373j implements InterfaceC5581d<Download> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ File f41136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f41137b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2052l<Integer, C9072e> f41138c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextToSpeechTokenUtterance f41139d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TtsControllerImpl f41140e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Request f41141f;

    /* JADX WARN: Multi-variable type inference failed */
    public C7373j(File file, File file2, InterfaceC2052l<? super Integer, C9072e> interfaceC2052l, TextToSpeechTokenUtterance textToSpeechTokenUtterance, TtsControllerImpl ttsControllerImpl, Request request) {
        this.f41136a = file;
        this.f41137b = file2;
        this.f41138c = interfaceC2052l;
        this.f41139d = textToSpeechTokenUtterance;
        this.f41140e = ttsControllerImpl;
        this.f41141f = request;
    }

    @Override // p122fl.InterfaceC5581d
    /* JADX INFO: renamed from: b */
    public final void mo11833b(Download download, Reason reason) {
        C5207g.m11111f(download, "data");
        C5207g.m11111f(reason, "reason");
        Status statusMo10588m = download.mo10588m();
        Status status = Status.COMPLETED;
        File file = this.f41136a;
        if (statusMo10588m != status) {
            if (download.mo10588m() == Status.FAILED) {
                file.delete();
            }
        } else {
            if (file.exists()) {
                file.renameTo(this.f41137b);
            }
            this.f41138c.mo528n(Integer.valueOf(this.f41139d.f21610b));
            this.f41140e.f16575f.mo10654h(this.f41141f.f32307k, this);
        }
    }
}
