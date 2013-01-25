package de.openms.knime.consensusXMLReader;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "ConsensusXMLReader" Node.
 * Converts consesnsusXML files to KNIME tables.	
 *
 * @author The OpenMS Team
 */
public class ConsensusXMLReaderNodeFactory 
        extends NodeFactory<ConsensusXMLReaderNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsensusXMLReaderNodeModel createNodeModel() {
        return new ConsensusXMLReaderNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<ConsensusXMLReaderNodeModel> createNodeView(final int viewIndex,
            final ConsensusXMLReaderNodeModel nodeModel) {
        return new ConsensusXMLReaderNodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new ConsensusXMLReaderNodeDialog();
    }

}
