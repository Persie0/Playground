package com.lingq.shared.network.adapters;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultSentence;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import p511yh.C10364a;
import tk.InterfaceC9302f;
import tk.InterfaceC9311o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, m13365d2 = {"Lcom/lingq/shared/network/adapters/ParagraphAdapter;", "", "", "Lcom/lingq/shared/network/result/ResultSentence;", "data", "Lyh/a;", "paragraphFromJson", "paragraph", "paragraphToJson", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ParagraphAdapter {
    @InterfaceC9302f
    public final C10364a paragraphFromJson(List<ResultSentence> data) {
        C5207g.m11111f(data, "data");
        return new C10364a(data);
    }

    @InterfaceC9311o
    public final List<ResultSentence> paragraphToJson(C10364a paragraph) {
        C5207g.m11111f(paragraph, "paragraph");
        return paragraph.f52118a;
    }
}
